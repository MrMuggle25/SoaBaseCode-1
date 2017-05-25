package ph.com.alliance.service;

import java.util.List;

import javax.persistence.EntityManager;

import ph.com.alliance.entity.Job;

public interface JobService {
	/**
	 * 
	 * @return
	 */
	
	
	public List<Job> getJobs();

	public void insertJob(Job job);

	public void updateJob(Job job);
	
	public void deleteJob(Job job);

}
