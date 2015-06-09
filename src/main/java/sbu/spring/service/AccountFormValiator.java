package sbu.spring.service;

import sbu.spring.domain.Account;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class AccountFormValiator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return Account.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		
	}

}
