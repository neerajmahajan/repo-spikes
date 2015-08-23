package controller.abtractcommandcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import exception.UserNotFoundException;
import model.LoginModel;
import pojo.Customer;

public class LoginController extends AbstractCommandController {

	LoginModel  loginModel;

	public void setLoginModel(LoginModel loginModel) {
		this.loginModel = loginModel;
	}

	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command,
			org.springframework.validation.BindException error) throws Exception {

		String type = loginModel.validate((Customer)command);

		if (type == null) {
			throw new UserNotFoundException("User Details are not valid");
		} else if (type.equals("admin")) {
			return new ModelAndView("/AdminHome.jsp");
		} else {
			return new ModelAndView("/UserHome.jsp");
		}

	}

}
