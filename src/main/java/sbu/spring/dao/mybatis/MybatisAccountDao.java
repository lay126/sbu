package sbu.spring.dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import sbu.spring.dao.mybatis.mapper.AccountMapper;
import sbu.spring.dao.AccountDao;
import sbu.spring.domain.Account;

public class MybatisAccountDao implements AccountDao {

	@Autowired
	private AccountMapper accountUserMapper;

	@Override
	public Account getAccount(String username)
			throws DataAccessException {
		return accountUserMapper.getAccountByUsername(username);
	}

	@Override
	public Account getAccount(String username, String userpwd)
			throws DataAccessException {
		return accountUserMapper.getAccountByUsernameAndPassword(username, userpwd);
	}

	@Override
	public void insertAccount(Account accountUser)
			throws DataAccessException {
		accountUserMapper.insertAccount(accountUser);
		accountUserMapper.insertProfile(accountUser);
	}

	@Override
	public void updateAccount(Account accountUser)
			throws DataAccessException {
		accountUserMapper.updateProfile(accountUser);
		
	}

	@Override
	public List<String> getUsernameList() throws DataAccessException {
		return accountUserMapper.getUsernameList();
	}

}
