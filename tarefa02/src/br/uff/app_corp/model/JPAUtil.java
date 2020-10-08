package br.uff.app_corp.model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	 private static EntityManagerFactory entityManagerFactory;
	 private static EntityManager entityManager;

	    public static EntityManager getEntityManager(){
	        if (entityManagerFactory == null) {
	        	entityManagerFactory = Persistence.createEntityManagerFactory("Eventos-PU");
	        }
	        if (entityManager == null) {
	        	entityManager = entityManagerFactory.createEntityManager();
	        }
	        return entityManager;        
	    }
	    
	    public static void close(){
	    	entityManager.close();
	    	entityManagerFactory.close();
	    }
	    
	

}
