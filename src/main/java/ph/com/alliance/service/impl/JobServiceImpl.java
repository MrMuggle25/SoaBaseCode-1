package ph.com.alliance.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.validation.ConstraintViolationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.stereotype.Service;

import ph.com.alliance.dao.JobDao;
import ph.com.alliance.dao.impl.JobDaoImpl;
import ph.com.alliance.entity.Job;
import ph.com.alliance.service.JobService;

@Service
public class JobServiceImpl implements JobService{

	@Autowired
	private JobDao jobDao;

	@Autowired
	private JpaTransactionManager transactionManager;

	@Override
	public List<Job> getJobs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertJob(Job job) {
		// TODO Auto-generated method stub
		EntityManager em = transactionManager.getEntityManagerFactory()
				.createEntityManager();
		try {
			em.getTransaction().begin();
			jobDao.insert(em, job);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			if(em.getTransaction().isActive())
				em.getTransaction().rollback();
		} finally {
			if (em.isOpen())
				em.close();
		}
		
	}

	@Override
	public void updateJob(Job job) {
		// TODO Auto-generated method stub
		EntityManager em = transactionManager.getEntityManagerFactory()
				.createEntityManager();
		try {
			em.getTransaction().begin();
			jobDao.update(em, job);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			if(em.getTransaction().isActive())
				em.getTransaction().rollback();
		} finally {
			if (em.isOpen())
				em.close();
		}
	}

	@Override
	public void deleteJob(Job job) {
		// TODO Auto-generated method stub
		EntityManager em = transactionManager.getEntityManagerFactory()
				.createEntityManager();
		try {
			em.getTransaction().begin();
			jobDao.delete(em, job);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			if(em.getTransaction().isActive())
				em.getTransaction().rollback();
		} finally {
			if (em.isOpen())
				em.close();
		}
	}
}
