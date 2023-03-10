package org.antwalk.controller;

import java.util.List;

import org.antwalk.entity.Stop;
import org.antwalk.repository.StopRepo;
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
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/stop")
public class StopController {
	
	@Autowired
	StopRepo stopRepo;
	
	@RequestMapping(value="/insert" , method=RequestMethod.POST)
	public ModelAndView insert(Stop s) {
		System.out.println("INsie root insert");
		stopRepo.save(s);
		 ModelAndView mv=new ModelAndView("showstop");	 
		 mv.addObject("Id",s.getSid());
		 mv.addObject("Name",s.getName());
		 
		 return mv;	 
	}
	
	@GetMapping("/getall")
	public List<Stop> getAll(){
		return stopRepo.findAll();
	}
	
	@GetMapping("/getbyid/{id}")
	public Stop getOne(@PathVariable long id) {
		return stopRepo.findById(id).get();
	}
	
	@DeleteMapping("/deletebyid/{id}")
	public String deleteById(@PathVariable long id) {
		stopRepo.deleteById(id);
		return "Deleted";
		
	}
	
	@PutMapping("/update/{id}")
	public String update(@RequestBody Stop s, @PathVariable long id) {
		List<Stop> stopList = stopRepo.findAll();
		for(Stop obj:stopList) {
			if(obj.getSid() == id) {
				if(s.getSid() == id) {
					stopRepo.save(s);
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
