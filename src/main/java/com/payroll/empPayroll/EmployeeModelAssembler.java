package com.payroll.empPayroll;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@Component
public class EmployeeModelAssembler implements RepresentationModelAssembler<Employee, EntityModel<Employee>> {

	@Override
	public EntityModel<Employee> toModel(Employee employee) {
		return new EntityModel<>(employee,
				linkTo(methodOn(EmployeeController.class).getOne(employee.getId())).withSelfRel(),
				linkTo(methodOn(EmployeeController.class).getAll()).withRel("employees"));
	}
}
