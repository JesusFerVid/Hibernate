package es.severo.persistence.test;

import es.severo.persistence.entity.Capitulo;
import es.severo.persistence.entity.Capitulo_;
import es.severo.persistence.entity.Libro;
import es.severo.persistence.entity.Libro_;
import es.severo.persistence.util.HibernateUtil;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;

import java.util.List;

public class TestOneToMany {
	public static void main(String[] args) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			try {
				session.beginTransaction();
//				Libro b1 = new Libro("2585622582252B", "Harry Potter and the Goblet of Fire", "J.K. Rowling");
//				Libro b2 = new Libro("2585622582252C", "Harry Potter and the Deathly Hallows", "J.K. Rowling");
//
//				Capitulo c1 = new Capitulo("The Scar", 22);
//				c1.setBook(b1);
//				Capitulo c2 = new Capitulo("The Quidditch World Championship", 17);
//				c2.setBook(b1);
//
//				Capitulo c3 = new Capitulo("Stuck by lighting", 23);
//				c3.setBook(b2);
//				Capitulo c4 = new Capitulo("Final fight", 30);
//				c4.setBook(b2);
//
//				session.persist(b1);
//				session.persist(b2);
//				session.persist(c1);
//				session.persist(c2);
//				session.persist(c3);
//				session.persist(c4);
//
//				Libro libro = session.find(Libro.class, 1L);
//				libro.getChapters().forEach(System.out::println);
//
//				session.remove(libro);
//
//				Capitulo capitulo = session.find(Capitulo.class, 3L);
//				System.out.println(capitulo.getBook());
//
//				CriteriaBuilder builder = session.getCriteriaBuilder();
//				CriteriaQuery<Libro> criteria = builder.createQuery(Libro.class);
//				Root<Libro> root = criteria.from(Libro.class);
//
//				Join<Libro, Capitulo> join = root.join(Libro_.capitulos);
//				criteria.select(root);
//
//				List<Libro> libros = session.createQuery(criteria).getResultList();
//				libros.forEach(System.out::println);
//
//				CriteriaBuilder builder = session.getCriteriaBuilder();
//				CriteriaQuery<Capitulo> criteria = builder.createQuery(Capitulo.class);
//				Root<Capitulo> root = criteria.from(Capitulo.class);
//
//				Join<Capitulo, Libro> join = root.join(Capitulo_.libro);
//				criteria
//					.select(root)
//						.where(
//							builder.equal(join, session.find(Libro.class, 2L))
//						);
//
//				List<Capitulo> capitulos = session.createQuery(criteria).getResultList();
//				capitulos.forEach(System.out::println);

				session.getTransaction().commit();
			} catch (RuntimeException e) {
				if (session.getTransaction() != null) {
					session.getTransaction().rollback();
				}
				throw e;
			}
		}
	}
}
