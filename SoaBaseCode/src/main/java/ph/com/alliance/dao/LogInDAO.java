package ph.com.alliance.dao;

import javax.persistence.EntityManager;

public interface LogInDAO {

	public boolean checkLogIn(EntityManager em, String username, String password);
}
