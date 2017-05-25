package ph.com.alliance.dao;

import java.util.List;

import javax.persistence.EntityManager;

import ph.com.alliance.entity.Job;

public interface JobDao {

	public List<Job> getJobs(EntityManager em);
	
	public Job getJob(EntityManager em, int id);

	public void insert(EntityManager em, Job job);

	public void update(EntityManager em, Job job);
	
	public void delete(EntityManager em, Job job);
	
	
}
