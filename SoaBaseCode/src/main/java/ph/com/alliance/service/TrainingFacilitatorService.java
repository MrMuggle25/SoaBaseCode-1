package ph.com.alliance.service;

import java.util.List;

import ph.com.alliance.entity.Person;
import ph.com.alliance.entity.TrainingFacilitator;

public interface TrainingFacilitatorService {

	 public List<String> getList();
	 
	 public List<TrainingFacilitator> getFaci();
	 
	 public void addFacilitator(TrainingFacilitator facilitator);

	 public void updatePerson(TrainingFacilitator facilitator);
	 
	 public void deletePerson(TrainingFacilitator facilitator);
}
