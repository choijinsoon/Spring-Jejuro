package com.jejuro.web.entity;

import java.util.Date;

public class Alarm {
	private int alarmId;
	
	private String price;
	private String flightCode;
	private Date dep;
	private Date arr;
	
	public Alarm() {
		// TODO Auto-generated constructor stub
	}

	public Alarm(String price) {
		this.price = price;
	}

	public Alarm(String price, String flightCode, Date dep, Date arr) {
		this.price = price;
		this.flightCode = flightCode;
		this.dep = dep;
		this.arr = arr;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getFlightCode() {
		return flightCode;
	}

	public void setFlightCode(String flightCode) {
		this.flightCode = flightCode;
	}

	public Date getDep() {
		return dep;
	}

	public void setDep(Date dep) {
		this.dep = dep;
	}

	public Date getArr() {
		return arr;
	}

	public void setArr(Date arr) {
		this.arr = arr;
	}

	@Override
	public String toString() {
		return "Alarm [alarmId=" + alarmId + ", price=" + price + ", flightCode=" + flightCode + ", dep=" + dep
				+ ", arr=" + arr + "]";
	}
	
}
