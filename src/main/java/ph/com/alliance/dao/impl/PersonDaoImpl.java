package ph.com.alliance.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import ph.com.alliance.dao.PersonDao;
import ph.com.alliance.entity.Person;

@Repository
public class PersonDaoImpl implements PersonDao{

	@Override
	public List<String> getList() {
		/*** PERFORM QUERY HERE ***/
		
		//QUERY FINISHED
		
		List<String> myList = null ; // myList = myQuery.getResult();
		
		myList = new ArrayList<String>();
		for(int counter = 0 ; counter < 10 ; counter++) {
			myList.add("THIS IS NEW STRING == " + counter);
		}
		return myList;
	}

	@Override
	public List<Person> getPersons(EntityManager em, int minAge, int maxAge) {
		List<Person> personList = null;
		///
		Query personQuery = em.createQuery("FROM Person myT WHERE myT.age > :minimumAge AND myT.age < :maximumAge ");
		personQuery.setParameter("minimumAge", minAge);
		personQuery.setParameter("maximumAge", maxAge);
		personList = personQuery.getResultList();
		
		return personList;
	}

	@Override
	public void insert(EntityManager em, Person person) {
		em.persist(person); // used purely for insertion
	}

	@Override
	public void update(EntityManager em, Person person) {
		em.merge(person); // can be used for insert / update
	}

	@Override
	public List<Person> searchById(EntityManager em, int id) {
		List<Person> personList = null;
		
		Query personQuery = em.createQuery("FROM Person myT WHERE myT.id = :id");
		personQuery.setParameter("id", id);
		personList = personQuery.getResultList();
		return personList;
	}

	@Override
	public List<Person> searchByName(EntityManager em, String name) {
		List<Person> personList = null;
		
		Query personQuery = em.createQuery("FROM Person myT WHERE myT.name = :name");
		personQuery.setParameter("name", name);
		personList = personQuery.getResultList();
		return personList;
	}

	@Override
	public List<Person> searchByAge(EntityManager em, int age) {
		List<Person> personList = null;
		
		Query personQuery = em.createQuery("FROM Person myT WHERE myT.age = :age");
		personQuery.setParameter("age", age);
		personList = personQuery.getResultList();
		return personList;
	}

	
	
	/*@Override
	public List<Person> search(EntityManager em, String code, String toSearch) {
		// TODO Auto-generated method stub
		List<Person> personList = null;
		Query personQuery = null;
		if(code.equals("1")){
			int id = Integer.parseInt(toSearch);
			personQuery = em.createQuery("FROM Person myT WHERE myT.id = :id");
			personQuery.setParameter("id", id);
		}
		else if(code.equals("2")){
			String name = toSearch;
			personQuery = em.createQuery("FROM Person myT WHERE myT.name = :name");
			personQuery.setParameter("name", name);
		}
		personList = personQuery.getResultList();
		return personList;
	}*/

	/*@Override
	public List<Person> search(EntityManager em) {
		return getSearchedPer
	}*/
}
