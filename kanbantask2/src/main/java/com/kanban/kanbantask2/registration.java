package com.kanban.kanbantask2;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="KanbanPortal2")
public class registration {
	
	@Id
	int id;
	
	@Column(name="Name")
	String name;
	
	@Column(name="Age")
	int age;
	
	@Column(name="TotalExperience")
	int totalexperience;
	
	@Column(name="RelevantExperience")
	int relevantexperience;
	
	@Column(name="Skills")
	String skills;
	
	@Column(name="MaritialStatus")
	String maritialstatus;
	
	@Column(name="Location")
	String location;
	
	public registration() {
		
	}
	public registration(String a , int b,int c,int d,String e,String f,String g) 
	{
	  	name=a;
	  	age=b;
	    totalexperience=c;
	    relevantexperience=d;
	    skills=e;
	    maritialstatus=f;
	    location=g;
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTotalexperience() {
		return totalexperience;
	}
	public void setTotalexperience(int totalexperience) {
		this.totalexperience = totalexperience;
	}
	public int getRelevantexperience() {
		return relevantexperience;
	}
	public void setRelevantexperience(int relevantexperience) {
		this.relevantexperience = relevantexperience;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getMaritialstatus() {
		return maritialstatus;
	}
	public void setMaritialstatus(String maritialstatus) {
		this.maritialstatus = maritialstatus;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	

}
