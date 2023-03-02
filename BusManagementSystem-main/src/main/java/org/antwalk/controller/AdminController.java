package org.antwalk.controller;
  
import java.util.List;

import org.antwalk.entity.Admin;
import org.antwalk.entity.Employee;
import org.antwalk.repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AdminRepo adminRepo;
	
	@RequestMapping(value="/insert" , method=RequestMethod.POST)
	public Admin insert(Admin a) {
		System.out.println("Ceated");
		System.out.println(a);
		return adminRepo.save(a);
	}
	
	@GetMapping("/getall")
	public List<Admin> getAll(){
		return adminRepo.findAll();
	}
	
	@GetMapping("/getbyid/{id}")
	public Admin getById(@PathVariable long id) {
		return adminRepo.findById(id).get();
	}
	
	@DeleteMapping("/deletebyid/{id}")
	public String deleteById(@PathVariable long id) {
		adminRepo.deleteById(id);
		return "Deleted";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public String update(Admin a, long id) {
		List<Admin> adminList = adminRepo.findAll();
		for(Admin obj:adminList) {
			if(obj.getAid() == id) {
				if(a.getAid() == id) {
					adminRepo.save(a);
					return "Updated";
				}
				
				else {
					return "Id doesn't match";
				}
				
			}
		}
		return "Id does not exist";
		
	}
}
