package ph.com.alliance.service;

import java.util.List;

import ph.com.alliance.entity.TrainingParticipant;

public interface TrainingParticipantService {

	 public List<String> getList();
	 
	 public List<TrainingParticipant> getParticipant();
	 
	 public void addParticipant(TrainingParticipant participant);

	 public void editParticipant(TrainingParticipant participant);
	 
	 public void deleteParticipant(TrainingParticipant participant);
}
