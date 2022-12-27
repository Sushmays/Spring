package com.xworkz.criminal.repo;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.criminal.dto.CriminalEntity;

@Component
public class CriminalRepoImpl implements CriminalRepo {

	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean save(CriminalEntity entity) {
		System.out.println("Running save method in repo");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction trans = manager.getTransaction();
		try {
			trans.begin();
			manager.persist(entity);
			trans.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
			trans.rollback();
		} finally {
			System.out.println("EntityManager closed");
			manager.close();
		}
		return true;
	}

	@Override
	public Optional<List<CriminalEntity>> fingByCriminalNameAndJailName(String criminalName, String jailName) {
		System.out.println("Running fingByCriminalNameAndJailName in repo..");
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("fingByCriminalNameAndJailName");
			query.setParameter("cn", criminalName);
			query.setParameter("jn", jailName);
			List resultList = query.getResultList();
			if(resultList!=null) {
				System.out.println("data is present");
				return Optional.ofNullable(resultList);
			}else {
				System.out.println("data is not present");
			}
		}
		catch(PersistenceException e) {
			e.printStackTrace();
		}
		finally {
			manager.close();
		}
		return Optional.empty();
	}
}

			

	/*public Optional<List<CriminalEntity>> findByQuery(String query) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query jql = manager.createQuery(query);
			return Optional.ofNullable(jql.getResultList());
		} catch (PersistenceException e) {
			e.getMessage();
		} finally {
			manager.close();
		}
		return CriminalRepo.super.findByQuery(query);
	}*/


