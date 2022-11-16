package es.severo.persistence.test;

import es.severo.persistence.entity.Presupuesto;
import es.severo.persistence.entity.Tramite;
import es.severo.persistence.util.HibernateUtil;
import org.hibernate.Session;

import java.time.LocalDateTime;

public class TestOneToOne {
	public static void main(String[] args) {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			try {
				session.beginTransaction();

				Tramite t = new Tramite();
				t.setTipo("Aval");
				t.setFecha(LocalDateTime.now());
				// session.persist(t);

				Presupuesto p = new Presupuesto();
				p.setLugarPresupuesto("Elche");
				session.persist(p);

				session.flush();

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
