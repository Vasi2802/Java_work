package org.antwalk.dao;

import java.util.List;

import org.antwalk.model.Customer;
import org.antwalk.model.Reservation;

public interface CustomerDao {
	
	public void createcust(Customer c, List<Reservation> rlist);
	public void updatecustbyId(int id,String Name);
	public void read();
	public void delete(int id);
	public void edit(int id);

}
