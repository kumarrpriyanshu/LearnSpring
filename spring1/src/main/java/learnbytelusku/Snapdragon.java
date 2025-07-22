package learnbytelusku;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Snapdragon implements MobileProcessor {

	@Override
	public void processor() {
		System.out.println("world best processor");
		
	}
	

}
