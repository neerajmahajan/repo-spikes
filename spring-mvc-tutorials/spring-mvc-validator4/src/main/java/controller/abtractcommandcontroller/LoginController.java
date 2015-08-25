package controller.abtractcommandcontroller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.FieldError;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import exception.UserNotFoundException;
import model.LoginModel;
import pojo.Customer;

@SuppressWarnings("deprecation")
public class LoginController extends AbstractCommandController {

	LoginModel loginModel;

	public void setLoginModel(LoginModel loginModel) {
		this.loginModel = loginModel;
	}

	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command,
			org.springframework.validation.BindException errors) throws Exception {

		if (errors.hasErrors()) {
			System.out.println("Errors in validation ---------------------------");
			PrintWriter out = response.getWriter();
			out.println("<br/>We have Found validation errors number of " + errors.getErrorCount() + "<br/>");
			for(FieldError fr : errors.getFieldErrors("uname")){
				out.println(fr.getDefaultMessage());
			}
			return null;
		}

		String type = loginModel.validateCustomer((Customer) command);

		if (type == null) {
			throw new UserNotFoundException("User Details are not valid");
		} else if (type.equals("admin")) {
			return new ModelAndView("/AdminHome.jsp");
		} else {
			return new ModelAndView("/UserHome.jsp");
		}

	}

}
