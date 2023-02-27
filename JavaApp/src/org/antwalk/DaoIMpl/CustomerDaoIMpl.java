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
	
	public void updatecustbyId(int id,String Name) {
		
		for(int i=0;i<clist.size();i++)
		{
		   if(clist.get(i).getCid()==id)
		   {
			   clist.get(i).setCname(Name);
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
			System.out.println("Customer Number : "+i);
			System.out.println(clist.get(i).getCid());
			System.out.println(clist.get(i).getCname());
			System.out.println(clist.get(i).getContact());
			System.out.println("Reservation ids for customer : "+i);
			for(int j=0;j<clist.get(i).getRlist().size();j++)
			{
				System.out.println(clist.get(i).getRlist().get(j).getRid());
			}
			System.out.println();
			
		}
	}

}
