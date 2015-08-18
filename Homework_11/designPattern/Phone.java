package designPattern;

public class Phone extends Device {

	private String color;

	public Phone() {
		setModel("");
		setBrand("");
		setColor("");
	}

	public Phone(String model, String brand, String color) {
		setModel(model);
		setBrand(brand);
		setColor(color);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void giveInfo(){
		System.out.println("Model: " + super.model + ", brand: " + super.brand + ", color: " + this.color);
	}
	
	
	
}
