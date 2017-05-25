package ph.com.alliance.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import ph.com.alliance.dao.TrainingDao;
import ph.com.alliance.entity.Job;
import ph.com.alliance.entity.Training;



@Repository
public class TrainingDaoImpl implements TrainingDao{

	@Override
	public List<String> getList() {
		List<String> myList = null ; // myList = myQuery.getResult();
		myList = new ArrayList<String>();
		for(int counter = 0 ; counter < 10 ; counter++) {
			myList.add("THIS IS NEW STRING == " + counter);
		}
		return myList;
	}

	@Override
	public List<Training> getTrainings(EntityManager em) {
		// TODO Auto-generated method stub
		List<Training> trainingList = null;
		///
		Query trainingQuery = em.createQuery("FROM Training ");
		trainingList = trainingQuery.getResultList();
		
		return trainingList;
	}
	
	public Training getTraining(EntityManager em, int id){
		Training training = new Training();
		Query trainingQuery = em.createQuery("FROM Job WHERE trainingbid = :id");
		trainingQuery.setParameter("id", id);
		training = (Training) trainingQuery.getSingleResult();
		
		return training;
	}
	
	@Override
	public void insert(EntityManager em, Training training) {
		em.persist(training); // used purely for insertion
		
	}

	@Override
	public void update(EntityManager em, Training training) {
		// TODO Auto-generated method stub
		em.merge(training); // can be used for insert / update
	}

	@Override
	public void delete(EntityManager em, Training training) {
		// TODO Auto-generated method stub
		
	}

	

}
