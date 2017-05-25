package ph.com.alliance.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import ph.com.alliance.dao.JobDao;
import ph.com.alliance.entity.Job;
import ph.com.alliance.entity.Person;

@Repository
public class JobDaoImpl implements JobDao{

	
	public List<Job> getJobs(EntityManager em){
		List<Job> jobList = null;
		///
		Query jobQuery = em.createQuery("FROM Job ");
		jobList = jobQuery.getResultList();
		
		return jobList;
		
	}
	
	public Job getJob(EntityManager em, int id){
		Job job = new Job();
		Query jobQuery = em.createQuery("FROM Job WHERE jobid = :id");
		jobQuery.setParameter("id", id);
		job = (Job) jobQuery.getSingleResult();
		
		return job;
	}

	@Override
	public void insert(EntityManager em, Job Job) {
		em.persist(Job); // used purely for insertion
	}

	@Override
	public void update(EntityManager em, Job Job) {
		em.merge(Job); // can be used for insert / update
	}

	@Override
	public void delete(EntityManager em, Job job) {
		// TODO Auto-generated method stub
		
		StringBuilder userQuery= new StringBuilder("DELETE FROM Job myT WHERE myT.userid= :id");
		Query query =em.createQuery(userQuery.toString());
		query.setParameter("id",job.getJobid());
		query.executeUpdate();
		
	
	}

}
