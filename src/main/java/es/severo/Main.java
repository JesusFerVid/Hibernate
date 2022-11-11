package es.severo;

import es.severo.persistence.entity.Tramite;
import es.severo.persistence.util.HibernateUtil;
import org.hibernate.Session;

import java.time.LocalDateTime;

public class Main {
	public static void main(String[] args) {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			Tramite t = new Tramite();
			t.setFecha(LocalDateTime.now());
			t.setTipo("Pago");
			session.persist(t);
			session.getTransaction().commit();
		} catch (Exception e) {
			if (session != null && session.getTransaction() != null) {
				session.getTransaction().rollback();
			}
		} finally {
			if (session != null) {
				session.close();
			}
			HibernateUtil.closeSessionFactory();
		}
	}
}