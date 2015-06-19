package sbu.spring.controller;

public class MockAuthenticator implements Authenticator {

	@Override
	public void authenticate(String id, String password) {
		if (!id.equals("lay1111")) {
			throw new AuthenticationException("invalid id "+id);
		}
	}

}
