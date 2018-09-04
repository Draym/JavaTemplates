package com.andres_k.dao;

import com.andres_k.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtils {
    private static final SessionFactory sessionFactory = buildSessionFactory();
    private static SessionFactory buildSessionFactory() {
        try {
            Configuration configuration = new Configuration();
            configuration.configure("/hibernate.cfg.xml");
            configuration.addAnnotatedClass(User.class);
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
                    configuration.getProperties()).build();
            return configuration.buildSessionFactory(serviceRegistry);
        } catch (Throwable ex) { throw new ExceptionInInitializerError(ex); }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static Session getActiveCurrentSession() {
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();

        return session;
    }
}
