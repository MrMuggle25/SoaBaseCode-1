package ph.com.alliance.dao;

import java.util.List;


import javax.persistence.EntityManager;

import ph.com.alliance.entity.TrainingFacilitator;



public interface TrainingFacilitatorDAO {
	
	public List<String> getList();
	
	public List<TrainingFacilitator> getFaci();

	public void addFacilitator(EntityManager em, TrainingFacilitator facilitator);
	
	public void editFacilitator(EntityManager em, TrainingFacilitator facilitator);
	
	public void deleteFacilitator(EntityManager em, TrainingFacilitator facilitator);
}
