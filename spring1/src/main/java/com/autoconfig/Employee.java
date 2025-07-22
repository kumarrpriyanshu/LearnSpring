package com.autoconfig;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private String name;
	private Adress adress;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Adress getAdress() {
		return adress;
	}
	public void setAdress(Adress adress) {
		this.adress = adress;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", adress=" + adress + "]";
	}
	

}
