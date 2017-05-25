package ph.com.alliance.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the skills_assessform database table.
 * 
 */
@Entity
@Table(name="skills_assessform")
@NamedQuery(name="SkillsAssessform.findAll", query="SELECT s FROM SkillsAssessform s")
public class SkillsAssessform implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int formid;

	//bi-directional many-to-one association to TrainingParticipant
	@ManyToOne
	@JoinColumn(name="fk_participantid")
	private TrainingParticipant trainingParticipant;

	public SkillsAssessform() {
	}

	public int getFormid() {
		return this.formid;
	}

	public void setFormid(int formid) {
		this.formid = formid;
	}

	public TrainingParticipant getTrainingParticipant() {
		return this.trainingParticipant;
	}

	public void setTrainingParticipant(TrainingParticipant trainingParticipant) {
		this.trainingParticipant = trainingParticipant;
	}

}