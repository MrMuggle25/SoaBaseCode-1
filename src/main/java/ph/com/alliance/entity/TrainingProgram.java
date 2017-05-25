package ph.com.alliance.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the training_program database table.
 * 
 */
@Entity
@Table(name="training_program")
@NamedQuery(name="TrainingProgram.findAll", query="SELECT t FROM TrainingProgram t")
public class TrainingProgram implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int tpid;

	@Temporal(TemporalType.DATE)
	@Column(name="end_date")
	private Date endDate;

	@Temporal(TemporalType.DATE)
	@Column(name="start_date")
	private Date startDate;

	private String title;

	//bi-directional many-to-one association to Training
	@OneToMany(mappedBy="trainingProgram")
	private List<Training> trainings;

	public TrainingProgram() {
	}

	public int getTpid() {
		return this.tpid;
	}

	public void setTpid(int tpid) {
		this.tpid = tpid;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Training> getTrainings() {
		return this.trainings;
	}

	public void setTrainings(List<Training> trainings) {
		this.trainings = trainings;
	}

	public Training addTraining(Training training) {
		getTrainings().add(training);
		training.setTrainingProgram(this);

		return training;
	}

	public Training removeTraining(Training training) {
		getTrainings().remove(training);
		training.setTrainingProgram(null);

		return training;
	}

}