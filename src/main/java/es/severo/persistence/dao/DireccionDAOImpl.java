package es.severo.persistence.dao;

import es.severo.persistence.dto.DireccionWrapper;
import es.severo.persistence.entity.Direccion;
import es.severo.persistence.entity.Direccion_;
import es.severo.persistence.util.HibernateUtil;
import jakarta.persistence.Tuple;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Path;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;

import java.util.List;

public class DireccionDAOImpl extends GenericDAOImpl<Direccion> implements DireccionDAO {
	public DireccionDAOImpl() {
		super(Direccion.class);
	}

	@Override
	public List<Direccion> findByStreetNumber(String number) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Direccion> criteria = builder.createQuery(Direccion.class);
			Root<Direccion> root = criteria.from(Direccion.class);
			criteria.select(root)
				.where(builder.equal(root.get(Direccion_.numero), number));
			return session.createQuery(criteria).getResultList();
		}
	}

	@Override
	public List<String> findAllStreetNameByNumber(String number) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<String> criteria = builder.createQuery(String.class);
			Root<Direccion> root = criteria.from(Direccion.class);
			criteria.select(root.get(Direccion_.calle))
				.where(builder.equal(root.get(Direccion_.calle), number));
			return session.createQuery(criteria).getResultList();
		}
	}

	@Override
	public List<Object[]> findAllStreetNameAndIdByNumberObject(String number) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Object[]> criteria = builder.createQuery(Object[].class);
			Root<Direccion> root = criteria.from(Direccion.class);

			Path<Long> id = root.get(Direccion_.id);
			Path<String> calle = root.get(Direccion_.calle);

			criteria.multiselect(id, calle)
				.where(builder.equal(root.get(Direccion_.calle), number));
			return session.createQuery(criteria).getResultList();
		}
	}

	@Override
	public List<Tuple> findAllStreetNameAndIdByNumberTuple(String number) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<Tuple> criteria = builder.createQuery(Tuple.class);
			Root<Direccion> root = criteria.from(Direccion.class);

			Path<Long> id = root.get(Direccion_.id);
			Path<String> calle = root.get(Direccion_.calle);

			criteria.multiselect(id, calle)
				.where(builder.equal(root.get(Direccion_.calle), number));
			return session.createQuery(criteria).getResultList();
		}
	}

	@Override
	public List<DireccionWrapper> findAllStreetNameAndIdByNumberWrapper(String number) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			CriteriaBuilder builder = session.getCriteriaBuilder();
			CriteriaQuery<DireccionWrapper> criteria = builder.createQuery(DireccionWrapper.class);
			Root<Direccion> root = criteria.from(Direccion.class);

			Path<Long> id = root.get(Direccion_.id);
			Path<String> calle = root.get(Direccion_.calle);

			criteria.multiselect(id, calle)
				.where(builder.equal(root.get(Direccion_.calle), number));
			return session.createQuery(criteria).getResultList();
		}
	}
}
