/** ayoung **/
package sbu.spring.dao.mybatis.mapper;

import java.util.List;

import org.springframework.dao.DataAccessException;

import sbu.spring.domain.*;

public interface AccountMapper {

	Account getAccountByUsername(String username);

	Account getAccountByUsernameAndPassword(String username, String userpwd);

	List<String> getUsernameList();

	void insertAccount(Account account);

	void insertProfile(Account account);

	void updateProfile(Account account);

}
