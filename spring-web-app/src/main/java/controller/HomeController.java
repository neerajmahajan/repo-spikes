package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import model.Customer;
import model.LoginModel;
import vo.User;

@Controller
public class HomeController {
	String message = "Welcome to your 1st Maven Spring project !";  
	
	LoginModel loginModel;
	
	public void setLoginModel(LoginModel loginModel) {
		this.loginModel = loginModel;
	}

	@RequestMapping("/hello")
	  public ModelAndView showMessage() {  
	        System.out.println("from controller");  
	        return new ModelAndView("hello", "message", message);  
	    }
	
	@RequestMapping("/newMessage")
	public ModelAndView newMessage(ServletRequest request, ServletResponse response, User user2) {
		String m = request.getParameter("m");
		System.out.println(user2.getName());
		Map<String, Object> modal = new HashMap<String, Object>();
		User user = new User();
		user.setName(m);
		modal.put("user", user);
		modal.put("msg", m);
		return new ModelAndView("hello",modal);
	}

	@RequestMapping("/login")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse  response) {
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		System.out.println(uname);
		System.out.println(pass);
		
		Customer customer = loginModel.validate(uname, pass);
		
		String type = customer.getName();
		System.out.println(type);
		if(type == null ){
			return new ModelAndView("Login");
		}else if(type.equals("admin")) {
			return new ModelAndView("AdminHome");
		} else {
			return new ModelAndView("UserHome");
		}
		
	}
	
}

