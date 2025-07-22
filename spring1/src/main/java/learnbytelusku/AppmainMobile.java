package learnbytelusku;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class AppmainMobile {
	
	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(Appconfig.class);
		Samsung s7= context.getBean(Samsung.class);
		s7.config();
		
	}
	

}
