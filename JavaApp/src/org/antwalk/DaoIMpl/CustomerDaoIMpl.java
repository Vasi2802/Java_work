package org.antwalk.DaoIMpl;

import java.util.ArrayList;
import java.util.List;

import org.antwalk.dao.CustomerDao;
import org.antwalk.model.Customer;
import org.antwalk.model.Reservation;

public class CustomerDaoIMpl implements CustomerDao{
	
	public static List<Customer> clist=new ArrayList<Customer>();
	public  void createcust(Customer c, List<Reservation> rlist)
	{
		c.setRlist(rlist);
		clist.add(c);
		
		System.out.println("CReated");
	}
	
	public void updatecustbyId(int id,String num) {
		
		for(int i=0;i<clist.size();i++)
		{
		   if(clist.get(i).getCid()==id)
		   {
			   clist.get(i).setContact(num);
		   }
		}
		System.out.println("Updated");
	}
	
	public void delete(int id)
	{
		for(int i=0;i<clist.size();i++)
		{
			if(clist.get(i).getCid()==id)
				clist.remove(id);
		}
		
		System.out.println("Deleted");
	}
	
	
	
	
	public void read()
	{
		for(int i=0;i<clist.size();i++)
		{
			System.out.println("Customer Number : "+(i+1));
			System.out.println(clist.get(i).getCid());
			System.out.println(clist.get(i).getCname());
			System.out.println(clist.get(i).getContact());
			System.out.println("Reservation Details for customer : "+(i+1));
			for(int j=0;j<clist.get(i).getRlist().size();j++)
			{
				System.out.println("Reservation Number : "+(j+1));
				System.out.println(clist.get(i).getRlist().get(j).getRid());
				System.out.println(clist.get(i).getRlist().get(j).getRdate());
				System.out.println(clist.get(i).getRlist().get(j).getCost());
				
			}
			System.out.println();
			System.out.println("******************************************");
			
		}
	}
	
	public void edit(int id)
	{
		for(int i=0;i<clist.size();i++)			
		{
			for(int j=0;j<clist.get(i).getRlist().size();j++)
			{
			   if(clist.get(i).getRlist().get(0).getRid()==id)
			   {
				   clist.get(i).getRlist().remove(j);
			   }
			}
		   
		}
	}

}
