package org.antwalk.controller;

import java.util.ArrayList;
import java.util.List;

import org.antwalk.model.Customer;
import org.antwalk.model.Reservation;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AppController {
	List<Customer> c = new ArrayList();
	List<Reservation> r = new ArrayList();
	
	public AppController()
	{
		super();
		Customer c1=new Customer(1001,"Rahul","98736738282");
		c.add(c1);
		Customer c2=new Customer(1002,"Rohit","3232443");
		c.add(c2);
		Customer c3=new Customer(1003,"Hardik","234567");
		c.add(c3);
		Customer c4=new Customer(1004,"Virat","987654345");
		c.add(c4);
		Customer c5=new Customer(1005,"Shardul","123456789");
		c.add(c5);
		
	
		r.add(new Reservation(3001,"12/12/2023",12000));
		r.add(new Reservation(3003,"12/03/2023",20000));
		r.add(new Reservation(3004,"01/01/20230",1765));
		r.add(new Reservation(3005,"28/02/12/2023",1876));
		r.add(new Reservation(3006,"05/02/12/2023",987));
		r.add(new Reservation(3007,"25/07/12/2023",140));	
		
		c.get(0).addReservation(r.get(1));
		c.get(1).addReservation(r.get(3));
		c.get(2).addReservation(r.get(4));
		c.get(0).addReservation(r.get(2));
		c.get(2).addReservation(r.get(5));
		
	}
	
	public int getindcust(int id)
	{
		Customer cs ;
		for(int i = 0;i < c.size();i++) {
			cs = c.get(i);
			if(cs.getCid() == id) {return i;}
		}
		return -1;
	}
	
	public int getindres(int id)
	{
		Reservation res ;
		for(int i = 0;i < r.size();i++) {
			res = r.get(i);
			if(res.getRid() == id) {return i;}
		}
		return -1;
	}
	
	@GetMapping("/getcustomers") // GET HTTP Method
	public List<Customer> lists1() {
		return c;
	}
	
	@GetMapping("/getreservations") // GET HTTP Method
	public List<Reservation> lists2() {
		return r;
	}
	
	@GetMapping("/customer/{id}/")
	public Customer custbyid(@PathVariable int id)
	{
		return c.get(getindcust(id));
	}
	
	@GetMapping("/reserve/{id}/")
	public Reservation resbyid(@PathVariable int id)
	{
		return r.get(getindres(id));
	}
	
	@DeleteMapping("/deletecust/{id}") // GET HTTP Method
	public void delete(@PathVariable int id) {
		c.remove(getindcust(id));
	}
	
	@PostMapping("/addcustomer") // GET HTTP Method
	public void addCourse(@RequestBody Customer ce) {
		c.add(ce);
	}
	
	@PutMapping("/addrestocust/{cId}/{rtId}") // GET HTTP Method
	public void addCourseToStudent(@PathVariable int cId,@PathVariable int rId) {
		Customer a = c.get(getindcust(cId));
		Reservation b = r.get(getindres(rId));
		a.addReservation(b);
	}

}
