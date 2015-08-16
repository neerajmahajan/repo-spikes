package model;

public class LoginModel {

//	private HibernateTemplate 
	
	public String validate(String uname, String pass) {
		if(uname.equals(pass)) {
			return "admin";
		}
		if(uname.equals("vishal")) {
			return "vishal";
		}
		return null;
	}
	
}
