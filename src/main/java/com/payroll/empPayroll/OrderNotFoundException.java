package com.payroll.empPayroll;

@SuppressWarnings("serial")
public class OrderNotFoundException extends RuntimeException {

	public OrderNotFoundException(Long id) {
		super("Could not find Order " + id);
	}
}
