package com.rd.pojo;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (namespace = "com.rd.pojo")
public class Enquiry {
	
	ArrayList<Car> carList;
	String enquiryType;
	String outletId;
	
	
	public Enquiry() {
		super();
	}
	
	public Enquiry(ArrayList<Car> carList, String enquiryType, String outletId) {
		super();
		this.carList = carList;
		this.enquiryType = enquiryType;
		this.outletId = outletId;
	}
	
	@XmlElementWrapper(name = "carList")
	@XmlElement(name = "car")
	public ArrayList<Car> getCarList() {
		return carList;
	}
	public void setCarList(ArrayList<Car> carList) {
		this.carList = carList;
	}
	public String getEnquiryType() {
		return enquiryType;
	}
	public void setEnquiryType(String enquiryType) {
		this.enquiryType = enquiryType;
	}
	public String getOutletId() {
		return outletId;
	}
	public void setOutletId(String outletId) {
		this.outletId = outletId;
	}

}
