package ph.com.alliance.service;

import java.util.List;

import javax.persistence.EntityManager;

import ph.com.alliance.entity.Person;
import ph.com.alliance.entity.Training;

public interface TrainingService {
	/**
	 * 
	 * @return
	 */
	
    public List<String> getList();
	
	public List<Training> getTrainings();

	public void insertTraining(Training training);

	public void updateTraining(Training training);
	
	public void deletePerson(int id);

}
