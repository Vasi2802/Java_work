package org.antwalk.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.antwalk.DaoIMpl.CustomerDaoIMpl;
import org.antwalk.DaoIMpl.ReservationDaoImpl;
import org.antwalk.dao.CustomerDao;
import org.antwalk.dao.ReservationDao;
import org.antwalk.model.Customer;
import org.antwalk.model.Reservation;

public class Test {

	public static void main(String[] args) {
		int ans;

		Customer c = new Customer(1, "Vasi", "98765432");
		Customer c2 = new Customer(2, "Rahul", "9876543484");
		Reservation r1 = new Reservation(101, "28/02/2000", 30000);
		Reservation r2 = new Reservation(104, "27/02/2000", 120000);
		Reservation r3 = new Reservation(102, "3/03/2000", 124000);
		Reservation r4 = new Reservation(106, "13/05/2000", 12090);
		Reservation r5 = new Reservation(105, "24/12/2023", 200000);
		List<Reservation> rlist = new ArrayList();
		List<Reservation> rlist2 = new ArrayList();
		rlist.add(r1);
		rlist.add(r2);
		rlist2.add(r4);
		rlist2.add(r5);
		CustomerDao t = new CustomerDaoIMpl();
		ReservationDao r=new ReservationDaoImpl();
		
		  Scanner scn=new Scanner(System.in);
		 t.createcust(c, rlist); 
		 t.createcust(c2, rlist2);
		 r.createres(r1, c);
		 r.createres(r2, c);
		 r.createres(r4, c2);
		 r.createres(r5, c2);
		 
		 do {
        System.out.println("1 for updatecust , 2 for readcust , 3 for deletecust , 4 for readcust");
        System.out.println("5 for updateres , 6 for readres , 7 for deleteres");
        int x=scn.nextInt();
        
        switch(x)
        {
        case 1 :
		t.updatecustbyId(1, "624378387336");
		break;
		
        case 2:
		t.read();
		break;
		
        case 3:
		t.delete(1);
		break;
		
        case 4:
		t.read();
		break;
		
        case 5:
        	r.updateres(102,"03/03/2022");
        	break;
        	
        case 6:
        	r.readres();
        	break;
        	
        case 7:
        	System.out.println("Enter reservation id to be deleted :");
        	int p=scn.nextInt();
        	r.deleteres(p);
        	t.edit(p);
        	break;

        default :
			break;
        }
        System.out.println("1 for Yes  0 for NO");
        ans=scn.nextInt();
		}while(ans==1);

	}

}
