package ph.com.alliance.service.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.stereotype.Service;

import ph.com.alliance.dao.TrainingParticipantDAO;
import ph.com.alliance.entity.TrainingFacilitator;
import ph.com.alliance.entity.TrainingParticipant;
import ph.com.alliance.service.TrainingParticipantService;

@Service
public class TrainingParticipantServiceImpl implements TrainingParticipantService {
	
	@Autowired
	private TrainingParticipantDAO trainingParticipantDAO;

	@Autowired
	private JpaTransactionManager transactionManager;

	@Override
	public List<String> getList() {
		return trainingParticipantDAO.getList(); 
	}

	@Override
	public List<TrainingParticipant> getParticipant() {
		EntityManager em = transactionManager.getEntityManagerFactory()
				.createEntityManager();
		List<TrainingParticipant> personList = null;
		try {
			personList = trainingParticipantDAO.getParticipant();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (em.isOpen())
				em.close();
		}

		return personList;
	}

	@Override
	public void addParticipant(TrainingParticipant participant) {
		EntityManager em = transactionManager.getEntityManagerFactory()
				.createEntityManager();
		try {
			em.getTransaction().begin();
			trainingParticipantDAO.addParticipant(em, participant);
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
	public void editParticipant(TrainingParticipant participant) {
		EntityManager em = transactionManager.getEntityManagerFactory()
				.createEntityManager();
		try {
			em.getTransaction().begin();
			trainingParticipantDAO.editParticipant(em, participant);
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
	public void deleteParticipant(TrainingParticipant participant) {
		// TODO Auto-generated method stub
		
	}

}
