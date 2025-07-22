package learnbytelusku;

import org.springframework.stereotype.Component;

@Component
public class Bike  implements vehicles{
	public void drive() {
		System.out.println("Bike is running");
	}

}
