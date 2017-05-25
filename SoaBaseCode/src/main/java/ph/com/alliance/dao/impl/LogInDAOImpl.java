package ph.com.alliance.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import ph.com.alliance.dao.LogInDAO;

@Repository
public class LogInDAOImpl implements LogInDAO{

	@Override
	public boolean checkLogIn(EntityManager em, String username, String password) {
		boolean userFound=false;
		Query query=em.createQuery("FROM Useraccount myT WHERE myT.username=:username AND myT.password= :password");
		query.setParameter("username", username);
		query.setParameter("password", password);
		List list = query.getResultList();
		
		if((list!=null) && (list.size()>0))
		{
			userFound=true;
		}
		
		return userFound;
	}

}
