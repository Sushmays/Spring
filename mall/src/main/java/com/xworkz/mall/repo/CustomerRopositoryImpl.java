package com.xworkz.mall.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.mall.entity.CustomerEntity;
import com.xworkz.mall.entity.CustomerFeedbackEntity;

@Component
public class CustomerRopositoryImpl implements CustomerRopository {

	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean save(CustomerEntity entity) {
		System.out.println("running save(CustomerEntity) in customer repo");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(entity);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return false;
	}

/*	@Override
	public boolean save(CustomerFeedbackEntity entity) {
		System.out.println("running save(CustomerFeedbackEntity) in customer repo");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(entity);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return false;

	}*/

	@Override
	public List<CustomerEntity> findByName(String name) {
		System.out.println("Running findByName");
		EntityManager createEntityManager = factory.createEntityManager();
		try {
			Query query = createEntityManager.createNamedQuery("findByName1");
			query.setParameter("cn", name);
			List singleResult = query.getResultList();
			if (singleResult != null) {
				// List<CustomerEntity> ref = (List<CustomerEntity>) singleResult;
				System.out.println("name is present" + singleResult);
				return singleResult;
			} else {
				System.out.println("name is null");
				return null;
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			createEntityManager.close();
		}

		return null;
	}

	@Override
	public List<CustomerEntity> findByEmail(String email) {
		System.out.println("Running findByEmail");
		EntityManager createEntityManager = factory.createEntityManager();
		try {
			Query query = createEntityManager.createNamedQuery("findByEmail");
			query.setParameter("em", email);
			List singleResult = query.getResultList();
			if (singleResult != null) {
				// List<CustomerEntity> ref = (List<CustomerEntity>) singleResult;
				System.out.println("email is present" + singleResult);
				return singleResult;
			} else {
				System.out.println("email is null");
				return null;
			}

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			createEntityManager.close();
		}
		return null;
	}

	@Override
	public List<CustomerEntity> findByMobileNo(long mobileNo) {
		System.out.println("Running findByMobileNo");
		EntityManager createEntityManager = factory.createEntityManager();
		try {
			Query query = createEntityManager.createNamedQuery("findByMobileNo");
			query.setParameter("mb", mobileNo);
			List singleResult = query.getResultList();
			if (singleResult != null) {
				// List<CustomerEntity> ref = (List<CustomerEntity>) singleResult;
				System.out.println("mobileNo is present" + singleResult);
				return singleResult;
			} else {
				System.out.println("mobileNo is null");
				return null;
			}

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			createEntityManager.close();
		}
		return null;
	}

}
