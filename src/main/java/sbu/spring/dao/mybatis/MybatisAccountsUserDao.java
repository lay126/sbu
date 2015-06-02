package sbu.spring.dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import sbu.spring.dao.mybatis.mapper.AccountsUserMapper;
import sbu.spring.dao.AccountsUserDao;
import sbu.spring.domain.AccountsUser;

public class MybatisAccountsUserDao implements AccountsUserDao {

	@Autowired
	private AccountsUserMapper accountUserMapper;

	@Override
	public AccountsUser getAccountsUser(String username)
			throws DataAccessException {
		return accountUserMapper.getAccountByUsername(username);
	}

	@Override
	public AccountsUser getAccountsUser(String username, String userpwd)
			throws DataAccessException {
		return accountUserMapper.getAccountByUsernameAndPassword(username, userpwd);
	}

	@Override
	public void insertAccountsUser(AccountsUser accountUser)
			throws DataAccessException {
		accountUserMapper.insertAccount(accountUser);
		accountUserMapper.insertProfile(accountUser);
	}

	@Override
	public void updateAccountsUser(AccountsUser accountUser)
			throws DataAccessException {
		accountUserMapper.updateProfile(accountUser);
		
	}

	@Override
	public List<String> getUsernameList() throws DataAccessException {
		return accountUserMapper.getUsernameList();
	}

}
