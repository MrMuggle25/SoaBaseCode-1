package ph.com.alliance.service.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.stereotype.Service;

import ph.com.alliance.dao.TrainingFacilitatorDAO;
import ph.com.alliance.entity.TrainingFacilitator;
import ph.com.alliance.service.TrainingFacilitatorService;

@Service
public class TrainingFacilitatorServiceImpl implements TrainingFacilitatorService {
	
	@Autowired
	private TrainingFacilitatorDAO trainingfacilitatorDAO;

	@Autowired
	private JpaTransactionManager transactionManager;
	

	@Override
	public List<String> getList() {
		return trainingfacilitatorDAO.getList(); 
		}

	@Override
	public void addFacilitator(TrainingFacilitator facilitator) {
		EntityManager em = transactionManager.getEntityManagerFactory()
				.createEntityManager();
		try {
			em.getTransaction().begin();
			trainingfacilitatorDAO.addFacilitator(em, facilitator);
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
	public void updatePerson(TrainingFacilitator facilitator) {
		EntityManager em = transactionManager.getEntityManagerFactory()
				.createEntityManager();
		try {
			em.getTransaction().begin();
			trainingfacilitatorDAO.editFacilitator(em, facilitator);
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
	public void deletePerson(TrainingFacilitator facilitator) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<TrainingFacilitator> getFaci() {
		EntityManager em = transactionManager.getEntityManagerFactory()
				.createEntityManager();
		List<TrainingFacilitator> personList = null;
		try {
			personList = trainingfacilitatorDAO.getFaci();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (em.isOpen())
				em.close();
		}

		return personList;
	}
	

}

