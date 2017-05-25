package ph.com.alliance.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import ph.com.alliance.dao.TrainingParticipantDAO;
import ph.com.alliance.entity.TrainingParticipant;

@Repository
public class TrainingParticipantDAOImpl implements TrainingParticipantDAO {

	@Override
	public List<String> getList() {
		List<String> myList = null ; 
		myList= new ArrayList<String>();
		for(int counter = 0 ; counter < 10 ; counter++) {
			myList.add(" " + counter);
		}
		return myList;
	}

	@Override
	public List<TrainingParticipant> getParticipant() {
		EntityManager em = null;
		List<TrainingParticipant> personList = null;
		Query personQuery = em.createQuery("FROM TrainingParticipant");
		personList = personQuery.getResultList();
		
		return personList;
	}

	@Override
	public void addParticipant(EntityManager em, TrainingParticipant participant) {
		em.persist(participant);
		
	}

	@Override
	public void editParticipant(EntityManager em, TrainingParticipant participant) {
		em.merge(participant);
		
	}

	@Override
	public void deleteParticipant(EntityManager em, TrainingParticipant participant) {
		// TODO Auto-generated method stub
		
	}

}
