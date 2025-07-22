package com.autoconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Appmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new AnnotationConfigApplicationContext(appconfig.class);
		Employee e1= context.getBean("emp", Employee.class);
		System.out.println(e1.toString());

	}

}
