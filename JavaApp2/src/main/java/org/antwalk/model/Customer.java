package org.antwalk.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	private int cid;
	private String cname;
	private String contact;
	
	
	List<Reservation> rlist=new ArrayList();


	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	public List<Reservation> getRlist() {
		return rlist;
	}


	public void setRlist(List<Reservation> rlist) {
		this.rlist = rlist;
	}


	public Customer(int cid, String cname, String contact) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.contact = contact;
	}

	public void addReservation(Reservation r)
	{
		this.rlist.add(r);
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", contact=" + contact + ", rlist=" + rlist + "]";
	}
	
	

}
