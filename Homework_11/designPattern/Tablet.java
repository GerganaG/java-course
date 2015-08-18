package designPattern;

public class Tablet extends Device {
	
	private int price;

	public Tablet() {
		setModel("");
		setBrand("");
		setPrice(0);
	}

	public Tablet(String model, String brand, int price) {
		setModel(model);
		setBrand(brand);
		setPrice(price);
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void giveInfo(){
		System.out.println("Model: " + super.model + ", brand: " + super.brand + ", price: " + this.price);
	}
	

}
