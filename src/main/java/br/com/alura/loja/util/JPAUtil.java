package br.com.alura.loja.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//essa classe serve pra isolar a criação do entityManager
public class JPAUtil {
	private static final EntityManagerFactory FACTORY = Persistence
			.createEntityManagerFactory("loja");
	
	public static EntityManager getEntityManager() {
		return FACTORY.createEntityManager();
	}
}
