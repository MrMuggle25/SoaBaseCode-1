package ph.com.alliance.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the faci_feedbackform database table.
 * 
 */
@Entity
@Table(name="faci_feedbackform")
@NamedQuery(name="FaciFeedbackform.findAll", query="SELECT f FROM FaciFeedbackform f")
public class FaciFeedbackform implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int formid;

	//bi-directional many-to-one association to TrainingFacilitator
	@ManyToOne
	@JoinColumn(name="fk_facilitatorid")
	private TrainingFacilitator trainingFacilitator;

	public FaciFeedbackform() {
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

}