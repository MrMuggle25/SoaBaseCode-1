package ph.com.alliance.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the effectiveness_assessform database table.
 * 
 */
@Entity
@Table(name="effectiveness_assessform")
@NamedQuery(name="EffectivenessAssessform.findAll", query="SELECT e FROM EffectivenessAssessform e")
public class EffectivenessAssessform implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int formid;

	//bi-directional many-to-one association to TrainingFacilitator
	@ManyToOne
	@JoinColumn(name="fk_facilitatorid")
	private TrainingFacilitator trainingFacilitator;

	//bi-directional many-to-one association to TrainingParticipant
	@ManyToOne
	@JoinColumn(name="fk_participantid")
	private TrainingParticipant trainingParticipant;

	public EffectivenessAssessform() {
	}

	public int getFormid() {
		return this.formid;
	}

	public void setFormid(int formid) {
		this.formid = formid;
	}

	public TrainingFacilitator getTrainingFacilitator() {
		return this.trainingFacilitator;
	}

	public void setTrainingFacilitator(TrainingFacilitator trainingFacilitator) {
		this.trainingFacilitator = trainingFacilitator;
	}

	public TrainingParticipant getTrainingParticipant() {
		return this.trainingParticipant;
	}

	public void setTrainingParticipant(TrainingParticipant trainingParticipant) {
		this.trainingParticipant = trainingParticipant;
	}

}