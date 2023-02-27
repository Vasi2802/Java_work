package org.antwalk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="reservation")
public class Reservation {
	@Id
	@GeneratedValue
	@Column(name="r_id")
	private int reserv_id;
	
	@Column(name="cost")
	private int price;
	
	@Column(name="month")
	private String month;
	
	 @ManyToOne
	private Customer customer;

	public int getReserv_id() {
		return reserv_id;
	}

	public void setReserv_id(int reserv_id) {
		this.reserv_id = reserv_id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Reservation(int price, String month, Customer customer) {
		super();
		this.price = price;
		this.month = month;
		this.customer = customer;
	}

	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 
	
	

}
