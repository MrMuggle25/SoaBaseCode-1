package ph.com.alliance.dao;

import java.util.List;

import javax.persistence.EntityManager;

import ph.com.alliance.entity.Person;

public interface PersonDao {

	public List<String> getList();
	
	public List<Person> getPersons(EntityManager em, int minAge, int maxAge);

	public void insert(EntityManager em, Person myTable);

	public void update(EntityManager em, Person myTable);
	
	//public List<Person> search(EntityManager em, String code, String toSearch);

	//public List<Person> search(EntityManager em);
	
	public List<Person> searchById(EntityManager em, int id);
	
	public List<Person> searchByName(EntityManager em, String name);
	
	public List<Person> searchByAge(EntityManager em, int age);
}
