package ph.com.alliance.dao;

import java.util.List;

import javax.persistence.EntityManager;

import ph.com.alliance.entity.Job;

public interface JobDao {

	public List<Job> getJobs(EntityManager em);

	public void insert(EntityManager em, Job job);

	public void update(EntityManager em, Job job);
	
	public List<Job> delete(EntityManager em, Job job);
	
	
}
