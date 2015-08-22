package com.rd.authentication;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rd.authentication.AuthenticationService;

public class RestAuthenticationFilter implements Filter {
	private static final String UNAME = "uname";
	public static final String AUTHENTICATION_HEADER = "Authorization";

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain filter) throws IOException, ServletException {
		if (request instanceof HttpServletRequest) {
			HttpServletRequest httpServletRequest = (HttpServletRequest) request;
			
			String uname = httpServletRequest
					.getHeader(UNAME);
			String authCredentials = httpServletRequest
					.getHeader(AUTHENTICATION_HEADER);
			
			System.out.println("##############filter running");

			// better injected
			AuthenticationService authenticationService = new AuthenticationService();

			boolean authenticationStatus = authenticationService
					.authenticate(authCredentials, uname);

			if (authenticationStatus) {
				filter.doFilter(request, response);
			} else {
				if (response instanceof HttpServletResponse) {
					HttpServletResponse httpServletResponse = (HttpServletResponse) response;
					httpServletResponse
							.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
				}
			}
		}
	}

	public void destroy() {
	}

	public void init(FilterConfig arg0) throws ServletException {
	}
}