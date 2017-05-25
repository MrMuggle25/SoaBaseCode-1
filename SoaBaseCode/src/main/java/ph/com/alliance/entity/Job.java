package ph.com.alliance.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the job database table.
 * 
 */
@Entity
@NamedQuery(name="Job.findAll", query="SELECT j FROM Job j")
public class Job implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int jobid;

	private String jobtitle;

	//bi-directional many-to-one association to Useraccount
	@OneToMany(mappedBy="job")
	private List<Useraccount> useraccounts;

	public Job() {
	}

	public int getJobid() {
		return this.jobid;
	}

	public void setJobid(int jobid) {
		this.jobid = jobid;
	}

	public String getJobtitle() {
		return this.jobtitle;
	}

	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}

	public List<Useraccount> getUseraccounts() {
		return this.useraccounts;
	}

	public void setUseraccounts(List<Useraccount> useraccounts) {
		this.useraccounts = useraccounts;
	}

	public Useraccount addUseraccount(Useraccount useraccount) {
		getUseraccounts().add(useraccount);
		useraccount.setJob(this);

		return useraccount;
	}

	public Useraccount removeUseraccount(Useraccount useraccount) {
		getUseraccounts().remove(useraccount);
		useraccount.setJob(null);

		return useraccount;
	}

}