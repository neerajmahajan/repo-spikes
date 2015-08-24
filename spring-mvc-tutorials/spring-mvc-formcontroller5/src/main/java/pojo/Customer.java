package pojo;

public class Customer {

	String uname;
	String fname;
	String lname;
	String password;
	CutomerDetail cutomerDetail;
	
	public CutomerDetail getCutomerDetail() {
		return cutomerDetail;
	}

	public void setCutomerDetail(CutomerDetail cutomerDetail) {
		this.cutomerDetail = cutomerDetail;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String passord) {
		this.password = passord;
	}

}
