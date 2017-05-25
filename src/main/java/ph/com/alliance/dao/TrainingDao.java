package ph.com.alliance.dao;

import java.util.List;

import javax.persistence.EntityManager;

import ph.com.alliance.entity.Job;
import ph.com.alliance.entity.Person;
import ph.com.alliance.entity.Training;

public interface TrainingDao {

	public List<String> getList();
	
	public List<Training> getTrainings(EntityManager em);

	public void insert(EntityManager em, Training training);

	public void update(EntityManager em, Training training);
	
	public void delete(EntityManager em, Training training);
}
