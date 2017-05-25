package ph.com.alliance.dao;

import java.util.List;

import javax.persistence.EntityManager;

import ph.com.alliance.entity.Useraccount;

public interface UseraccountDao {

	public List<String> getList();
	
	/**
	 * 
	 * @param puser
	 * @return
	 */
	public boolean createUseraccount(EntityManager pEM, Useraccount pUser);
	
	/**
	 * 
	 * @param p_em
	 * @param pUser
	 * @return
	 */
	public Useraccount updateUseraccount(EntityManager pEM, Useraccount pUser);
	
	/**
	 * 
	 * @param p_em
	 * @param pUser
	 * @return
	 */
	public int deleteUseraccount(EntityManager pEM, Useraccount pUser);
	
	/**
	 * 
	 * @param p_em
	 * @param pUser
	 * @return
	 */
	public Useraccount selectUseraccount(EntityManager pEM, String pUid);
	
	/**
	 * 
	 * @param p_em
	 * @param pKey
	 * @return
	 */
	public List<Useraccount> selectUseraccounts(EntityManager pEM, String pKey);
	
	/**
	 * 
	 * @param pEM
	 * @return
	 */
	public List<Useraccount> selectAllUseraccounts(EntityManager pEM);
	
}
