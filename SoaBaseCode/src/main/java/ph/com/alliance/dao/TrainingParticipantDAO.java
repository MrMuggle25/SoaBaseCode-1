package ph.com.alliance.dao;

import java.util.List;

import javax.persistence.EntityManager;

import ph.com.alliance.entity.TrainingParticipant;

public interface TrainingParticipantDAO {

	public List<String> getList();
	
	public List<TrainingParticipant> getParticipant();

	public void addParticipant(EntityManager em, TrainingParticipant participant);
	
	public void editParticipant(EntityManager em, TrainingParticipant participant);
	
	public void deleteParticipant(EntityManager em, TrainingParticipant participant);

}
