package es.severo.persistence.test;

import es.severo.persistence.entity.Presupuesto;
import es.severo.persistence.entity.Tramite;
import es.severo.persistence.util.HibernateUtil;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;

import java.util.List;

public class TestOneToOne {
	public static void main(String[] args) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			try {
				session.beginTransaction();

//				Tramite t = new Tramite();
//				t.setTipo("Aval");
//				t.setFecha(LocalDateTime.now());
//				session.persist(t);
//
//				Presupuesto p = new Presupuesto();
//				p.setLugarPresupuesto("Elche");
//				p.setTramite(t);
//				session.persist(p);
//
//				Presupuesto p2 = session.find(Presupuesto.class, 1L);
//				p2.setLugarPresupuesto("Alicante");
//				session.merge(p2);
//				System.out.println(p2.getTramite());
//				session.flush();

				CriteriaBuilder builder = session.getCriteriaBuilder();
				CriteriaQuery<Presupuesto> criteria = builder.createQuery(Presupuesto.class);
				Root<Presupuesto> root = criteria.from(Presupuesto.class);
				criteria.select(root);

				List<Presupuesto> presupuestos = session.createQuery(criteria)
						.getResultList();
				presupuestos.forEach(System.out::println);

				Tramite t2 = session.find(Tramite.class, 2L);
				session.remove(t2);

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
