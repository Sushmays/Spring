package com.xworkz.register.repo;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.register.dto.PatientDetailDTO;

@Component
public class PatientDetailRepoImpl implements PatientDetailRepo {

	@Autowired
	private EntityManagerFactory factory;

	public PatientDetailRepoImpl() {
		System.out.println("Created PatientDetailRepoImpl in repo");
	}

	@Override
	public boolean save(PatientDetailDTO dto) {
		System.out.println("Running save method");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			System.out.println("Check "+dto.getCreatedBy() +" "+dto.getCreatedDataTime());
			transaction.begin();
			manager.persist(dto);
			transaction.commit();
		} catch (PersistenceException e) {
			e.getMessage();
			transaction.rollback();
		} finally {
			manager.close();
		}
		return true;
	}

	@Override
	public Optional<List<PatientDetailDTO>> findByNameGreaterThanAgeOrLesserThanAge(String name,int greaterThanAge, int lesserThanAge) {
		System.out.println("Running findByName method");
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByNameGreaterThanAgeOrLesserThanAge");
			query.setParameter("nam", name);
			query.setParameter("ag", greaterThanAge);
			query.setParameter("ae", lesserThanAge);
			return Optional.ofNullable(query.getResultList());
		} catch (PersistenceException e) {
			e.getMessage();
		} finally {
			manager.close();
		}
		return PatientDetailRepo.super.findByNameGreaterThanAgeOrLesserThanAge(name,greaterThanAge,lesserThanAge);
	}
	
	public Optional<List<PatientDetailDTO>> findByQuery(String query) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query jql = manager.createQuery(query);
			return Optional.ofNullable(jql.getResultList());
		} catch (PersistenceException e) {
			e.getMessage();
		} finally {
			manager.close();
		}
		return PatientDetailRepo.super.findByQuery(query);
	}	

	@Override
	public List<PatientDetailDTO> findByEmail(String email) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByEmail");
			query.setParameter("em", email);
			List resultList = query.getResultList();
			if (resultList.isEmpty()) {
				System.out.println("Mail id save");
				return null;
			} else if (!resultList.isEmpty()) {
				System.out.println("mail id is duplicated and already exist");
				return resultList;
			}

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
		
	}

	@Override
	public List<PatientDetailDTO> findByMobileNo(long mobileNo) {
		EntityManager manager = factory.createEntityManager();
		try {
			Query query = manager.createNamedQuery("findByMobileNo");
			query.setParameter("mb", mobileNo);
			List resultList = query.getResultList();
			if (resultList.isEmpty()) {
				System.out.println("Mobile No saved");
				return null;
			} else if (!resultList.isEmpty()) {
				System.out.println("Mobile No is already exist please check..");
				return resultList;
			}

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}
}
