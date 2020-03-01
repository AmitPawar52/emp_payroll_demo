package com.payroll.empPayroll;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {

	@Id
	@GeneratedValue
	private Long id;
	private String firstName;
	private String lastName;
	private String name;
	private String role;
	
	Employee(){
		
	}
	
	Employee(String name, String role){
		this.name = name;
		this.role = role;
	}
	
	Employee(String firstName, String lastName, String role){
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
	}
	
	public String getName(){
		return this.firstName + " " + this.lastName;
	}
	
	public void setName(String name) {
		String[] parts = name.split(" ");
		this.firstName = parts[0];
		this.lastName = parts[1];
	}
}
