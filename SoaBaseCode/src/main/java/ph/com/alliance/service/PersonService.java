package ph.com.alliance.service;

import java.util.List;

import javax.persistence.EntityManager;

import ph.com.alliance.entity.Person;

public interface PersonService {
	/**
	 * 
	 * @return
	 */
	
    public List<String> getList();
	
	public List<Person> getPersons();

	public void insertPerson(Person myTable);

	public void updatePerson(Person myTable);
	
	public List<Person> searchPerson(String code, String toSearch);
	
	public void deletePerson(Person myTable);

}
