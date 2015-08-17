package com.rd.authentication;
import java.io.IOException;
import java.util.Base64;
import java.util.StringTokenizer;

public class AuthenticationService {
	public boolean authenticate(String authCredentials, String uname) {

		if (null == authCredentials)
			return false;
		// header value format will be "Basic encodedstring" for Basic
		// authentication. Example "Basic YWRtaW46YWRtaW4="
		final String encodedUserPassword = authCredentials.replaceFirst("Basic"
				+ " ", "");
		String password = null;
		try {
			byte[] decodedBytes = Base64.getDecoder().decode(
					encodedUserPassword);
			password = new String(decodedBytes, "UTF-8");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// we have fixed the userid and password as admin
		// call some UserService/LDAP here
		boolean authenticationStatus = "admin".equals(uname)
				&& "admin".equals(password);
		return authenticationStatus;
	}
}
