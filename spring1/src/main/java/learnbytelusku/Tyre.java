package learnbytelusku;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
	private  String brand;
	
 // for consturctor injection
//	public Tyre(String brand) {
//		
//		this.brand = brand;
//	}
// for getter setter injection
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Tyre [brand=" + brand + "]";
	}
	

}
