package it.zeneli.gestionale_logistico.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UtilityDao {
    private static EntityManagerFactory factory;
    public static void init(){
        factory = Persistence.createEntityManagerFactory("DefaultPersistenceUnit");
    }

    public static EntityManager getEntityManager(){
        return factory.createEntityManager();
    }

}
