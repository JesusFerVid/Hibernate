package es.severo.persistence.dao;

import es.severo.persistence.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Optional;

public class GenericDAOImpl<T> implements GenericDAO<T>{
	private final Class<T> entityClass;

	public GenericDAOImpl(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	@Override
	public void create(T entity) {
		Transaction tx = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			tx = session.beginTransaction();
			session.persist(entity);
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
	}

	@Override
	public void save(T entity) {
		Transaction tx = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			tx = session.beginTransaction();
			session.merge(entity);
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
	}

	@Override
	public void delete(T entity) {
		Transaction tx = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			tx = session.beginTransaction();
			session.remove(entity);
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
	}

	@Override
	public void deleteById(Long id) {
		Transaction tx = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			tx = session.beginTransaction();
			session.remove(session.find(entityClass, id));
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		}
	}

	@Override
	public Optional<T> findById(Long id) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()){
			return Optional.ofNullable(session.find(entityClass, id));
		}
	}
}
