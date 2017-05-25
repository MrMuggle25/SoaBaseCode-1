package ph.com.alliance.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int userid;

	private String barangay;

	private String city;

	private String contactno;

	private int day;

	private String emailad;

	private String fname;

	private String gender;

	private String lname;

	private String mname;

	private int month;

	private String password;

	private String province;

	private String username;

	private String usertype;

	private int year;

	//bi-directional many-to-one association to EmpPosition
	@OneToMany(mappedBy="user")
	private List<EmpPosition> emppositions;

	//bi-directional many-to-one association to TrainingFacilitator
	@OneToMany(mappedBy="user")
	private List<TrainingFacilitator> trainingFacilitators;

	//bi-directional many-to-one association to TrainingParticipant
	@OneToMany(mappedBy="user")
	private List<TrainingParticipant> trainingParticipants;

	public User() {
	}

	public int getUserid() {
		return this.userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getBarangay() {
		return this.barangay;
	}

	public void setBarangay(String barangay) {
		this.barangay = barangay;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getContactno() {
		return this.contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public int getDay() {
		return this.day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getEmailad() {
		return this.emailad;
	}

	public void setEmailad(String emailad) {
		this.emailad = emailad;
	}

	public String getFname() {
		return this.fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLname() {
		return this.lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getMname() {
		return this.mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public int getMonth() {
		return this.month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsertype() {
		return this.usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public List<EmpPosition> getEmpPositions() {
		return this.emppositions;
	}

	public void setEmployeepos(List<EmpPosition> emppositions) {
		this.emppositions = emppositions;
	}

	public EmpPosition addEmpPosition(EmpPosition empposition) {
		getEmpPositions().add(empposition);
		empposition.setUser(this);

		return empposition;
	}

	public EmpPosition removeEmpPosition(EmpPosition empposition) {
		getEmpPosition().remove(empposition);
		empposition.setUser(null);

		return empposition;
	}

	public List<TrainingFacilitator> getTrainingFacilitators() {
		return this.trainingFacilitators;
	}

	public void setTrainingFacilitators(List<TrainingFacilitator> trainingFacilitators) {
		this.trainingFacilitators = trainingFacilitators;
	}

	public TrainingFacilitator addTrainingFacilitator(TrainingFacilitator trainingFacilitator) {
		getTrainingFacilitators().add(trainingFacilitator);
		trainingFacilitator.setUser(this);

		return trainingFacilitator;
	}

	public TrainingFacilitator removeTrainingFacilitator(TrainingFacilitator trainingFacilitator) {
		getTrainingFacilitators().remove(trainingFacilitator);
		trainingFacilitator.setUser(null);

		return trainingFacilitator;
	}

	public List<TrainingParticipant> getTrainingParticipants() {
		return this.trainingParticipants;
	}

	public void setTrainingParticipants(List<TrainingParticipant> trainingParticipants) {
		this.trainingParticipants = trainingParticipants;
	}

	public TrainingParticipant addTrainingParticipant(TrainingParticipant trainingParticipant) {
		getTrainingParticipants().add(trainingParticipant);
		trainingParticipant.setUser(this);

		return trainingParticipant;
	}

	public TrainingParticipant removeTrainingParticipant(TrainingParticipant trainingParticipant) {
		getTrainingParticipants().remove(trainingParticipant);
		trainingParticipant.setUser(null);

		return trainingParticipant;
	}

}