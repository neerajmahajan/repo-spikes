package pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class CutomerDetail {
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	Date dob;

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

}
