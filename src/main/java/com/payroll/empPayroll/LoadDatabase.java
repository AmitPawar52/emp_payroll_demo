package com.payroll.empPayroll;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class LoadDatabase {

  @Bean
  CommandLineRunner initDatabase(EmployeeRepository repository, OrderRepository orderRepo) {
    return args -> {
      log.info("Preloading " + repository.save(new Employee("Bilbo", "Baggins", "burglar")));
      log.info("Preloading " + repository.save(new Employee("Frodo", "Baggins", "thief")));
      orderRepo.save(new Order("MacBook pro", Status.COMPLETED));
      orderRepo.save(new Order("iPhone 11", Status.IN_PROGRESS));
      orderRepo.findAll().forEach(order -> {
    	  log.info("preloaded "+ order);
      });
    };
  }
}