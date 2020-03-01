package com.payroll.empPayroll;

@SuppressWarnings("serial")
public class EmployeeNotFoundException extends RuntimeException {
	
	public EmployeeNotFoundException(Long id) {
		super("Could not find employee " + id);
	}
}
