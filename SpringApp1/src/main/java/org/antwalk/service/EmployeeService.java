package org.antwalk.service;

import java.util.ArrayList;
import java.util.List;

import org.antwalk.entity.Employee;
import org.antwalk.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository emprepo;
	
	public Employee create(Employee e) {
		emprepo.save(e);
		return e;
	}
		
	public Employee update(Employee e) {
			emprepo.save(e);
			return e;
	}
	
	public List<Employee> read(){
		List<Employee> e = new ArrayList<Employee>();
		for(Employee p:emprepo.findAll()) {
			e.add(p);
		}
		return e;
	}


}
