package learnbytelusku;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan("learnbytelusku")
public class App {
	public static void main(String[] args) {
//		Car c1= new Car();
//		c1.drive();
//		Bike b1= new Bike();
//		b1.drive();
		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
		Car v1=(Car)context.getBean("car");
		v1.drive();
//		Tyre t= (Tyre) context.getBean("tyre");
//		System.out.println(t.toString());

	}
}
