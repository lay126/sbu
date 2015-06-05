/** ayoung **/

package sbu.spring.dao;

import sbu.spring.domain.*;
import org.springframework.dao.DataAccessException;
import java.util.List;

public interface AccountDao {

	Account getAccount(String username) throws DataAccessException;
	Account getAccount(String username, String userpwd) throws DataAccessException;
	
	void insertAccount(Account account) throws DataAccessException;
	void updateAccount(Account account) throws DataAccessException;
	
	List<String> getUsernameList() throws DataAccessException;

}
