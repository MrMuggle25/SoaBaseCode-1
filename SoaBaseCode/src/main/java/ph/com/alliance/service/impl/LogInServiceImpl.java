package ph.com.alliance.service.impl;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.stereotype.Service;

import ph.com.alliance.dao.LogInDAO;
import ph.com.alliance.service.LogInService;

@Service
public class LogInServiceImpl implements LogInService{

	@Autowired
	private LogInDAO logInDao;

	@Autowired
	private JpaTransactionManager transactionManager;
	
	@Override
	public boolean checkLogIn(String username, String password) {
		EntityManager em= transactionManager.getEntityManagerFactory().createEntityManager();
		return logInDao.checkLogIn(em, username, password);
	}

}
