package ph.com.alliance.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the needs_analysisform database table.
 * 
 */
@Entity
@Table(name="needs_analysisform")
@NamedQuery(name="NeedsAnalysisform.findAll", query="SELECT n FROM NeedsAnalysisform n")
public class NeedsAnalysisform implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int formid;

	//bi-directional many-to-one association to TrainingParticipant
	@ManyToOne
	@JoinColumn(name="fk_participantid")
	private TrainingParticipant trainingParticipant;

	public NeedsAnalysisform() {
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