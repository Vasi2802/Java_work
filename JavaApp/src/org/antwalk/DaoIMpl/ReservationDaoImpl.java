package org.antwalk.DaoIMpl;

import java.util.ArrayList;
import java.util.List;

import org.antwalk.dao.CustomerDao;
import org.antwalk.dao.ReservationDao;
import org.antwalk.model.Customer;
import org.antwalk.model.Reservation;

public class ReservationDaoImpl implements ReservationDao{
	public static List<Reservation> reslist=new ArrayList<Reservation>();
	public void createres(Reservation r, Customer c)
	{
		r.setCustomer(c);
		reslist.add(r);
		System.out.println("Reservation created");		
	}
	
	public void updateres(int id , String d)
	{
		for(int i=0;i<reslist.size();i++)
		{
			if(reslist.get(i).getRid()==id)
				{
				reslist.get(i).setRdate(d);
				break;
				}
		}
		System.out.println("Reservation date updated");
		
	}
	
	public void readres()
	{
		for(int i=0;i<reslist.size();i++)
		{
			System.out.println("Reservation number : "+(i+1));
			System.out.println(reslist.get(i).getRid());
			System.out.println(reslist.get(i).getRdate());
			System.out.println(reslist.get(i).getCost());
			System.out.println(reslist.get(i).getRid());
			System.out.println("Detail of customer : ");
			System.out.println(reslist.get(i).getCustomer().getCname());
			System.out.println(reslist.get(i).getCustomer().getContact());			
		}
		System.out.println("*****************************************");
		
	}
	
	public void deleteres(int id)
	{
		for(int i=0;i<reslist.size();i++)
		{
			if(reslist.get(i).getRid()==id)
			{
				reslist.remove(i);
			}
		}
		
		System.out.println("Deletion successfull");
	}
	
	

}
