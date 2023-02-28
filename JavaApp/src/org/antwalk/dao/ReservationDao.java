package org.antwalk.dao;

import org.antwalk.DaoIMpl.CustomerDaoIMpl;
import org.antwalk.model.Customer;
import org.antwalk.model.Reservation;

public interface ReservationDao {
	public void createres(Reservation r, Customer c);
	public void deleteres(int id);
	public void updateres(int id, String date);
	public void readres();

}
