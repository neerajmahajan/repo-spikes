package model;

public class LoginModel {

//	private HibernateTemplate 
	
	public String validate(String uname, String password) {

		if (uname.equals("admin")) {
			return "admin";
		} else if (uname.equals("vishal")) {
			return "vishal";
		} else {
			return null;
		}
		
	}
	
}
