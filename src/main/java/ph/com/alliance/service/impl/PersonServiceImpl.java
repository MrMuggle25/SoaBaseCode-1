package ph.com.alliance.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.validation.ConstraintViolationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.stereotype.Service;

import ph.com.alliance.dao.PersonDao;
import ph.com.alliance.dao.impl.PersonDaoImpl;
import ph.com.alliance.entity.Person;
import ph.com.alliance.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	private PersonDao personDao;

	@Autowired
	private JpaTransactionManager transactionManager;

	@Override
	public List<String> getList() {
		return personDao.getList();
	}

	@Override
	public List<Person> getPersons() {
		EntityManager em = transactionManager.getEntityManagerFactory()
				.createEntityManager();
		List<Person> personList = null;
		try {
			personList = personDao.getPersons(em, 0, 99);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (em.isOpen())
				em.close();
		}

		return personList;
	}

	@Override
	public void insertPerson(Person person) {
		EntityManager em = transactionManager.getEntityManagerFactory()
				.createEntityManager();
		try {
			em.getTransaction().begin();
			personDao.insert(em, person);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			if(em.getTransaction().isActive())
				em.getTransaction().rollback();
		} finally {
			if (em.isOpen())
				em.close();
		}
	}

	@Override
	public void updatePerson(Person person) {
		EntityManager em = transactionManager.getEntityManagerFactory()
				.createEntityManager();
		try {
			em.getTransaction().begin();
			personDao.update(em, person);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			if(em.getTransaction().isActive())
				em.getTransaction().rollback();
		} finally {
			if (em.isOpen())
				em.close();
		}
	}
	
	//public List<Person> getSearchedPersons(String code, Stirng toSearch)
	@Override
	public List<Person> searchPerson(String code, String toSearch) {
		// TODO Auto-generated method stub
		List<Person> personList = null;
		EntityManager em = transactionManager.getEntityManagerFactory()
				.createEntityManager();
		try {
			em.getTransaction().begin();
			if(code.equals("1")){
				int id = Integer.parseInt(toSearch);
				//personDao.searchById(em, id);
				personList = personDao.searchById(em, id);
			}
			else if(code.equals("2")){
				String name = toSearch;
				personList = personDao.searchByName(em, name);
			}
			else if(code.equals("3")){
				int age = Integer.parseInt(toSearch);
				personList = personDao.searchByAge(em, age);
			}
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			if(em.getTransaction().isActive())
				em.getTransaction().rollback();
		} finally {
			if (em.isOpen())
				em.close();
		}
		
		return personList;
		
	}

	@Override
	public void deletePerson(Person myTable) {
		// TODO Auto-generated method stub
		
	}

}
