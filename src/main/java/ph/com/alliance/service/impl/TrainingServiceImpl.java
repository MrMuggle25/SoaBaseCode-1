package ph.com.alliance.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.validation.ConstraintViolationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.stereotype.Service;







import ph.com.alliance.dao.TrainingDao;
import ph.com.alliance.entity.Person;
import ph.com.alliance.entity.Training;
import ph.com.alliance.service.TrainingService;

@Service
public class TrainingServiceImpl implements TrainingService{

	@Autowired
	private TrainingDao trainingDao;

	@Autowired
	private JpaTransactionManager transactionManager;

	@Override
	public List<String> getList() {
		// TODO Auto-generated method stub
		return trainingDao.getList();
	}

	@Override
	public List<Training> getTrainings() {
		// TODO Auto-generated method stub
		EntityManager em = transactionManager.getEntityManagerFactory()
				.createEntityManager();
		List<Training> trainingList = null;
		try {
			trainingList = trainingDao.getTrainings(em);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (em.isOpen())
				em.close();
		}

		return trainingList;
	}

	@Override
	public void insertTraining(Training training) {
		// TODO Auto-generated method stub
		EntityManager em = transactionManager.getEntityManagerFactory()
				.createEntityManager();
		try {
			em.getTransaction().begin();
			trainingDao.insert(em, training);
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
	public void updateTraining(Training training) {
		EntityManager em = transactionManager.getEntityManagerFactory()
				.createEntityManager();
		try {
			em.getTransaction().begin();
			trainingDao.update(em, training);
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
	public void deletePerson(int id) {
		// TODO Auto-generated method stub
		
	}

	

}
