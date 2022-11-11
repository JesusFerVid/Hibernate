package es.severo.persistence.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;


public class HibernateUtil {
	private static SessionFactory sessionFactory;

	private HibernateUtil() {}

	private static SessionFactory buildSessionFactory() {
		ServiceRegistry sr = new StandardServiceRegistryBuilder()
			.configure("META-INF/hibernate.cfg.xml")
			.build();
		Metadata metadata = new MetadataSources(sr).getMetadataBuilder().build();
		return metadata.buildSessionFactory();
	}

	public static SessionFactory getSessionFactory(){
		if (sessionFactory == null) {
			sessionFactory = buildSessionFactory();
		}
		return sessionFactory;
	}

	public static void closeSessionFactory() {
		getSessionFactory().close();
	}
}
