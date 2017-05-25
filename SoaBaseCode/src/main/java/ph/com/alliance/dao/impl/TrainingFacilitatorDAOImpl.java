package ph.com.alliance.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import ph.com.alliance.dao.TrainingFacilitatorDAO;
import ph.com.alliance.entity.TrainingFacilitator;

@Repository
public class TrainingFacilitatorDAOImpl implements TrainingFacilitatorDAO{

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
	public List<TrainingFacilitator> getFaci() {
		EntityManager em = null;
		List<TrainingFacilitator> personList = null;
		Query personQuery = em.createQuery("FROM TrainingFacilitator");
		personList = personQuery.getResultList();
		
		return personList;
	}

	@Override
	public void addFacilitator(EntityManager em, TrainingFacilitator facilitator) {
		em.persist(facilitator);
		
	}

	@Override
	public void editFacilitator(EntityManager em, TrainingFacilitator facilitator) {
		em.merge(facilitator);
		
	}

	@Override
	public void deleteFacilitator(EntityManager em, TrainingFacilitator facilitator) {
		// TODO Auto-generated method stub
		
	}

}
