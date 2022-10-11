package com.kanban.kanbantask2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;

@RestController

@CrossOrigin(origins = "http://localhost:4200")
public class Controller {
	
	@Autowired
	registrationrepository repo;
	

	
	@PostMapping("/addingdetails")

	public String addData(@RequestBody registration registration)
	{
		
		repo.save(registration);
		return "hi you are  successfully updated the candidate details";
		
  }
	
	@GetMapping("showdata")
	public List finding(){
		return (List) repo.findAll();
	}
	

}
