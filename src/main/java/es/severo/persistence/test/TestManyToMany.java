package es.severo.persistence.test;

import es.severo.persistence.dao.GenericDAO;
import es.severo.persistence.dao.GenericDAOImpl;
import es.severo.persistence.dao.PersonaDAO;
import es.severo.persistence.dao.PersonaDAOImpl;
import es.severo.persistence.entity.Persona;
import es.severo.persistence.util.HibernateUtil;
import org.hibernate.Session;

public class TestManyToMany {
	public static void main(String[] args) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			try {
				session.beginTransaction();

//				Persona p1 = new Persona("Pepe");
//				Persona p2 = new Persona("Ramón");
//				Persona p3 = new Persona("Giorgi");
//				Persona p4 = new Persona("Kevin");
//
//				Direccion d1 = new Direccion("Pino", "5");
//				Direccion d2 = new Direccion("Central Park", "6A");
//				Direccion d3 = new Direccion("Sin nombre", "s/n");
//				Direccion d4 = new Direccion("Ancha", "0");
//
//				p1.addDireccion(d1);
//				p1.addDireccion(d2);
//				p2.addDireccion(d3);
//				p2.addDireccion(d4);
//				p3.addDireccion(d1);
//				p3.addDireccion(d4);
//				p4.addDireccion(d2);
//				p4.addDireccion(d4);
//
//				session.persist(p1);
//				session.persist(p2);
//				session.persist(p3);
//				session.persist(p4);
//
//				Persona persona = session.find(Persona.class, 1L);
//				session.remove(persona);

				// Direcciones de una persona dada
//				CriteriaBuilder builder = session.getCriteriaBuilder();
//				CriteriaQuery<Direccion> criteria = builder.createQuery(Direccion.class);
//				Root<Direccion> root = criteria.from(Direccion.class);
//				Join<Direccion, Persona> join = root.join(Direccion_.personas);
//				criteria.select(root).where(
//					builder.equal(join.get(Persona_.id), 6L)
//				);
//
//				List<Direccion> direcciones = session.createQuery(criteria).getResultList();
//				direcciones.forEach(System.out::println);

				// Direcciones de una persona que además contengan una palabra
//				CriteriaBuilder builder = session.getCriteriaBuilder();
//				CriteriaQuery<Direccion> criteria = builder.createQuery(Direccion.class);
//				Root<Direccion> root = criteria.from(Direccion.class);
//				Join<Direccion, Persona> join = root.join(Direccion_.personas);
//				criteria.select(root).where(
//					builder.and(
//						builder.equal(join.get(Persona_.id), 6L),
//						builder.like(root.get(Direccion_.calle), "%Sin%")
//					)
//				);
//
//				List<Direccion> direcciones = session.createQuery(criteria).getResultList();
//				direcciones.forEach(System.out::println);

				// Actualizar número de calle de una persona y dirección dadas
//				Persona persona = session.find(Persona.class, 6L);
//				Direccion direccion = session.find(Direccion.class, 4L);
//
//				persona.removeDireccion(direccion);
//				direccion.setNumero("1");
//				persona.addDireccion(direccion);
//
//				session.merge(persona);

				session.getTransaction().commit();
			} catch (RuntimeException e) {
				if (session.getTransaction() != null) {
					session.getTransaction().rollback();
					throw e;
				}
			}
		}
	}
}
