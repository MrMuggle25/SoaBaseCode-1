package ph.com.alliance.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the training_participant database table.
 * 
 */
@Entity
@Table(name="training_participant")
@NamedQuery(name="TrainingParticipant.findAll", query="SELECT t FROM TrainingParticipant t")
public class TrainingParticipant implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int participantid;

	//bi-directional many-to-one association to Attendance
	@OneToMany(mappedBy="trainingParticipant")
	private List<Attendance> attendances;

	//bi-directional many-to-one association to CourseFeedbackform
	@OneToMany(mappedBy="trainingParticipant")
	private List<CourseFeedbackform> courseFeedbackforms;

	//bi-directional many-to-one association to EffectivenessAssessform
	@OneToMany(mappedBy="trainingParticipant")
	private List<EffectivenessAssessform> effectivenessAssessforms;

	//bi-directional many-to-one association to NeedsAnalysisform
	@OneToMany(mappedBy="trainingParticipant")
	private List<NeedsAnalysisform> needsAnalysisforms;

	//bi-directional many-to-one association to SkillsAssessform
	@OneToMany(mappedBy="trainingParticipant")
	private List<SkillsAssessform> skillsAssessforms;

	//bi-directional many-to-one association to Useraccount
	@ManyToOne
	@JoinColumn(name="fk_userid")
	private Useraccount useraccount;

	//bi-directional many-to-one association to Training
	@ManyToOne
	@JoinColumn(name="fk_trainingid")
	private Training training;

	public TrainingParticipant() {
	}

	public int getParticipantid() {
		return this.participantid;
	}

	public void setParticipantid(int participantid) {
		this.participantid = participantid;
	}

	public List<Attendance> getAttendances() {
		return this.attendances;
	}

	public void setAttendances(List<Attendance> attendances) {
		this.attendances = attendances;
	}

	public Attendance addAttendance(Attendance attendance) {
		getAttendances().add(attendance);
		attendance.setTrainingParticipant(this);

		return attendance;
	}

	public Attendance removeAttendance(Attendance attendance) {
		getAttendances().remove(attendance);
		attendance.setTrainingParticipant(null);

		return attendance;
	}

	public List<CourseFeedbackform> getCourseFeedbackforms() {
		return this.courseFeedbackforms;
	}

	public void setCourseFeedbackforms(List<CourseFeedbackform> courseFeedbackforms) {
		this.courseFeedbackforms = courseFeedbackforms;
	}

	public CourseFeedbackform addCourseFeedbackform(CourseFeedbackform courseFeedbackform) {
		getCourseFeedbackforms().add(courseFeedbackform);
		courseFeedbackform.setTrainingParticipant(this);

		return courseFeedbackform;
	}

	public CourseFeedbackform removeCourseFeedbackform(CourseFeedbackform courseFeedbackform) {
		getCourseFeedbackforms().remove(courseFeedbackform);
		courseFeedbackform.setTrainingParticipant(null);

		return courseFeedbackform;
	}

	public List<EffectivenessAssessform> getEffectivenessAssessforms() {
		return this.effectivenessAssessforms;
	}

	public void setEffectivenessAssessforms(List<EffectivenessAssessform> effectivenessAssessforms) {
		this.effectivenessAssessforms = effectivenessAssessforms;
	}

	public EffectivenessAssessform addEffectivenessAssessform(EffectivenessAssessform effectivenessAssessform) {
		getEffectivenessAssessforms().add(effectivenessAssessform);
		effectivenessAssessform.setTrainingParticipant(this);

		return effectivenessAssessform;
	}

	public EffectivenessAssessform removeEffectivenessAssessform(EffectivenessAssessform effectivenessAssessform) {
		getEffectivenessAssessforms().remove(effectivenessAssessform);
		effectivenessAssessform.setTrainingParticipant(null);

		return effectivenessAssessform;
	}

	public List<NeedsAnalysisform> getNeedsAnalysisforms() {
		return this.needsAnalysisforms;
	}

	public void setNeedsAnalysisforms(List<NeedsAnalysisform> needsAnalysisforms) {
		this.needsAnalysisforms = needsAnalysisforms;
	}

	public NeedsAnalysisform addNeedsAnalysisform(NeedsAnalysisform needsAnalysisform) {
		getNeedsAnalysisforms().add(needsAnalysisform);
		needsAnalysisform.setTrainingParticipant(this);

		return needsAnalysisform;
	}

	public NeedsAnalysisform removeNeedsAnalysisform(NeedsAnalysisform needsAnalysisform) {
		getNeedsAnalysisforms().remove(needsAnalysisform);
		needsAnalysisform.setTrainingParticipant(null);

		return needsAnalysisform;
	}

	public List<SkillsAssessform> getSkillsAssessforms() {
		return this.skillsAssessforms;
	}

	public void setSkillsAssessforms(List<SkillsAssessform> skillsAssessforms) {
		this.skillsAssessforms = skillsAssessforms;
	}

	public SkillsAssessform addSkillsAssessform(SkillsAssessform skillsAssessform) {
		getSkillsAssessforms().add(skillsAssessform);
		skillsAssessform.setTrainingParticipant(this);

		return skillsAssessform;
	}

	public SkillsAssessform removeSkillsAssessform(SkillsAssessform skillsAssessform) {
		getSkillsAssessforms().remove(skillsAssessform);
		skillsAssessform.setTrainingParticipant(null);

		return skillsAssessform;
	}

	public Useraccount getUseraccount() {
		return this.useraccount;
	}

	public void setUseraccount(Useraccount useraccount) {
		this.useraccount = useraccount;
	}

	public Training getTraining() {
		return this.training;
	}

	public void setTraining(Training training) {
		this.training = training;
	}

}