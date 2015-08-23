package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import exception.UserNotFoundException;
import model.LoginModel;

public class LoginController implements Controller {
	
	LoginModel  loginModel;
	
	public void setLoginModel(LoginModel loginModel) {
		this.loginModel = loginModel;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		String type = loginModel.validate(uname, pass);
		
		if (type == null) {
			throw new UserNotFoundException("User Details are not valid");
		} else if (type.equals("admin")) {
			return new ModelAndView("/AdminHome.jsp");
		} else {
			return new ModelAndView("/UserHome.jsp");
		}
	}

}
