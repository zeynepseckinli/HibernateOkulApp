package com.bilgeadam.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * HibernateUtility
 * Bu sınır hibernate.cfg.cml doyasini kullanarak connection
 * oluşturmak için kullanilacaktir.
 * Istenirse hibernate dosyasinin konumu burada belirtilerek
 * farklı losaksyonlardan okunabilir.
 *
 */

public class HibernateUtility {

    private static final SessionFactory SESSION_FACTORY = sessionFactoryHibernate();

    private static SessionFactory sessionFactoryHibernate(){
        try {
            Configuration configuration = new Configuration();
            SessionFactory factory = configuration.configure().buildSessionFactory();
            return factory;

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static SessionFactory getSessionFactory(){
        return SESSION_FACTORY;
    }
}
