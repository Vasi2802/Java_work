package org.antwalk.model;

public class Reservation {
	private int rid;
	private String rdate;
	private int cost;
	
	Customer customer;

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getRdate() {
		return rdate;
	}

	public void setRdate(String rdate) {
		this.rdate = rdate;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Reservation(int rid, String rdate, int cost) {
		super();
		this.rid = rid;
		this.rdate = rdate;
		this.cost = cost;
		this.customer = customer;
	}
	
	

}
