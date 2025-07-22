package com.autoconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.autoconfig.")
public class appconfig {
	@Bean
	public Adress adress() {
		Adress adress= new Adress();
		adress.setCity("lucknow");
		adress.setCountry("india");
		return adress;
		
	}
	@Bean
	public Employee emp() {
		Employee emp= new Employee();
		emp.setName("priyanshu");
		emp.setAdress(adress());
		return emp;
	}
	

}
