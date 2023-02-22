package com.xworkz.mall.repo;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.xworkz.mall.entity.AdminEntity;

@Repository
public class MallRepositoryImpl implements MallRepository {

	@Autowired
	private EntityManagerFactory factory;
	
/*	@Override
	public boolean save(AdminEntity entity) {
		EntityManager manager= factory.createEntityManager();
		EntityTransaction trans= manager.getTransaction();
		try {
			trans.begin();
			manager.persist(entity);
			trans.commit();
			
		}catch(PersistenceException e) {
			e.printStackTrace();
			trans.rollback();
		}finally {
			manager.close();
			System.out.println("Manager closed");
		}		
		return true;
	}
*/

	@Override
	public AdminEntity findByAdminNameAndPassword(String adminName, String password) {
		System.out.println("Running findByAdminNameAndPassword in mallRepo..");
		EntityManager createEntityManager = factory.createEntityManager();
		try {
			Query createNamedQuery = createEntityManager.createNamedQuery("findByAdminNameAndPasswordS");
			createNamedQuery.setParameter("ad", adminName);
			createNamedQuery.setParameter("ps", password);
			Object singleResult = createNamedQuery.getSingleResult();
			System.out.println(singleResult);
			if (singleResult != null) {
				AdminEntity ref = (AdminEntity) singleResult;
				System.out.println("result is present" + ref);
				return ref;
			} else {
				System.out.println("result is not present");
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
	public AdminEntity updateNoOfWrongAttemptsByName(String adminName, int noOfWrongAttempt) {
		System.out.println("Running updateNoOfWrongAttemptsByName");
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		try {
			transaction.begin();
			Query query = createEntityManager.createNamedQuery("updateNoOfWrongAttemptsByName");
			query.setParameter("nm", adminName);
			query.setParameter("na", noOfWrongAttempt);
			int executeUpdate = query.executeUpdate();
			transaction.commit();
			System.out.println(executeUpdate);
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			createEntityManager.close();
		}
		return null;
	}

	@Override
	public AdminEntity findByName(String adminName) {
		System.out.println("Running findByName");
		EntityManager createEntityManager = factory.createEntityManager();
		try {
			Query query = createEntityManager.createNamedQuery("findByName");
			query.setParameter("nm", adminName);
			Object singleResult = query.getSingleResult();
			if (singleResult != null) {
				AdminEntity refe = (AdminEntity) singleResult;
				System.out.println("list is present" + refe);
				return refe;

			} else {
				System.out.println("list is null");
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
	public AdminEntity updatefirstLoginByName(String adminName, int firstLogin) {
		System.out.println("Running updatefirstLoginByName");
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		try {
			transaction.begin();
			Query query = createEntityManager.createNamedQuery("updatefirstLoginByName");
			query.setParameter("nm", adminName);
			query.setParameter("lg", firstLogin);
			int executeUpdate = query.executeUpdate();
			transaction.commit();
			System.out.println(executeUpdate);

		} catch (PersistenceException e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			createEntityManager.close();
		}
		return null;
	}

	@Override
	public AdminEntity updateAccountLockedByName(String adminName, String accountLocked) {
		System.out.println("Running updateAccountLockedByName");
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		try {
			transaction.begin();
			Query query = createEntityManager.createNamedQuery("updateAccountLockedByName");
			query.setParameter("nm", adminName);
			query.setParameter("al", accountLocked);
			int executeUpdate = query.executeUpdate();
			transaction.commit();
			System.out.println(executeUpdate);
			return null;
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			createEntityManager.close();
		}
		return null;
	}

	@Override
	public AdminEntity updateGeneratedPasswordByName(String adminName, String generatedPassword) {
		System.out.println("Running updateGeneratedPasswordByName");
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		try {
			transaction.begin();
			Query query = createEntityManager.createNamedQuery("updateGeneratedPasswordByName");
			query.setParameter("nm", adminName);
			query.setParameter("gpas", generatedPassword);
			int executeUpdate = query.executeUpdate();
			transaction.commit();
			System.out.println(executeUpdate);
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			createEntityManager.close();
		}
		return null;
	}

	@Override
	public AdminEntity updatePasswordByGeneratedPassword(String generatedPassword, String password) {
		System.out.println("Running updatePasswordByGeneratedPassword");
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		try {
			transaction.begin();
			Query query = createEntityManager.createNamedQuery("updatePasswordByGeneratedPassword");
			query.setParameter("ps", password);
			query.setParameter("gs", generatedPassword);
			int executeUpdate = query.executeUpdate();
			System.out.println(executeUpdate);
			transaction.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			createEntityManager.close();
		}
		return null;
	}

	@Override
	public AdminEntity findByMallName(String name) {
		System.out.println("Running findByMallName");
		EntityManager createEntityManager = factory.createEntityManager();
		try {
			Query query = createEntityManager.createNamedQuery("findByMallName");
			query.setParameter("mn", name);
			Object singleResult = query.getSingleResult();
			if (singleResult != null) {
				AdminEntity refe = (AdminEntity) singleResult;
				System.out.println("result is not null" + refe);
				return refe;

			} else {
				System.out.println("result is null");
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
	public AdminEntity updateGeneratedPasswordByMallName(String name, String generatedPassword) {
		System.out.println("Running updateGeneratedPasswordByMallName");
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		try {
			transaction.begin();
			Query query = createEntityManager.createNamedQuery("updateGeneratedPasswordByMallName");
			query.setParameter("mn", name);
			query.setParameter("gs", generatedPassword);
			int executeUpdate = query.executeUpdate();
			System.out.println(executeUpdate);
			transaction.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			createEntityManager.close();
		}
		return null;

	}

	@Override
	public AdminEntity updateLoginCountByAdminName(String adminName, int loginCount) {
		System.out.println("Running updateLoginCountByAdminName");
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		try {
			transaction.begin();
			Query query = createEntityManager.createNamedQuery("updateLoginCountByAdminName");
			query.setParameter("nm", adminName);
			query.setParameter("lc", loginCount);
			int executeUpdate = query.executeUpdate();
			System.out.println(executeUpdate);
			transaction.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			createEntityManager.close();
		}
		return null;
	}

	@Override
	public AdminEntity updateTimeByMall(String name, LocalTime time) {
		System.out.println("Running updateTimeByMall");
		EntityManager createEntityManager = factory.createEntityManager();
		EntityTransaction transaction = createEntityManager.getTransaction();
		try {
			transaction.begin();
			Query query = createEntityManager.createNamedQuery("updateTimeByMallName");
			query.setParameter("mn", name);
			query.setParameter("ti", time);
			int executeUpdate = query.executeUpdate();
			System.out.println(executeUpdate);
			transaction.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			createEntityManager.close();
		}
		return null;

	}

	@Override
	public AdminEntity updateAccountUnlockByName(String name, String accountLocked) {
		System.out.println("Running updateAccountUnlockByName");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Query query = manager.createNamedQuery("updateAcountUnlockByName");
			query.setParameter("mn", name);
			query.setParameter("al", accountLocked);
			int executeUpdate = query.executeUpdate();
			System.out.println(executeUpdate);
			transaction.commit();
		} catch (PersistenceException e) {

			e.printStackTrace();
			transaction.rollback();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public AdminEntity updateNoOfWrongAttemptsByMallName(String name, int noOfWrongAttempts) {
		System.out.println("Running updateNoOfWrongAttemptsByMallName");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Query query = manager.createNamedQuery("updateNoOfWrongAttemptsByMallName");
			query.setParameter("mn", name);
			query.setParameter("noof", noOfWrongAttempts);
			int executeUpdate = query.executeUpdate();
			transaction.commit();
			System.out.println(executeUpdate);
			
		} catch (PersistenceException e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public AdminEntity findByGeneratedPassword(String generatedPassword) {
		System.out.println("Running findByGeneratedPassword");
		EntityManager manager = factory.createEntityManager();

		try {
			Query query = manager.createNamedQuery("findByGeneratedPassword");
			query.setParameter("ps", generatedPassword);
			Object singleResult = query.getSingleResult();
			if (singleResult != null) {
				AdminEntity ref = (AdminEntity) singleResult;
				System.out.println("data is present" + singleResult);
				return ref;
			} else {
				System.out.println("data is not present");
				return null;
			}
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			manager.close();
		}
		return null;
	}

	@Override
	public AdminEntity updateGeneratedPasswordTimeByGeneratedPassword(String generatedPassword,
			LocalTime generatedPasswordTime) {
		System.out.println("Running updateGeneratedPasswordTimeByGeneratedPassword");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			Query query = manager.createNamedQuery("updateGeneratedPasswordTimeByGeneratedPassword");
			query.setParameter("gp", generatedPassword);
			query.setParameter("gpt", generatedPasswordTime);
			int executeUpdate = query.executeUpdate();
			System.out.println(executeUpdate);
			transaction.commit();
		} catch (PersistenceException e) {

			e.printStackTrace();
			transaction.rollback();
		} finally {
			manager.close();
		}

		return null;

	}

	
	
}
