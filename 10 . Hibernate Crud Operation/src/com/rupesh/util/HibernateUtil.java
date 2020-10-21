package com.rupesh.util;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
	private static StandardServiceRegistry standardServiceRegistry;
	private static SessionFactory sessionFactory;

	static {
		try {
			if (sessionFactory == null) {
				standardServiceRegistry = new StandardServiceRegistryBuilder()
						.configure("/com/rupesh/resources/hibernate.cfg.xml").build();
				MetadataSources metadataSources = new MetadataSources(standardServiceRegistry);
				Metadata metaData = metadataSources.getMetadataBuilder().build();
				sessionFactory = metaData.getSessionFactoryBuilder().build();
			}
		} catch (Exception e) {
			e.printStackTrace();
			if (standardServiceRegistry != null) {
				StandardServiceRegistryBuilder.destroy(standardServiceRegistry);
			}
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
