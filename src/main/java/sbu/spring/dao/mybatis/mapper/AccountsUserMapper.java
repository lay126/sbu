/** ayoung **/
package sbu.spring.dao.mybatis.mapper;

import java.util.List;

import org.springframework.dao.DataAccessException;

import sbu.spring.domain.*;

public interface AccountsUserMapper {

	AccountsUser getAccountByUsername(String username);

	AccountsUser getAccountByUsernameAndPassword(String username, String userpwd);

	List<String> getUsernameList();

	void insertAccount(AccountsUser account);

	void insertProfile(AccountsUser account);

	void updateProfile(AccountsUser account);

}
