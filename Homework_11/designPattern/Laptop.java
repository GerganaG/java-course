package designPattern;

public class Laptop extends Device{

	private float weight;

	public Laptop() {
		setModel("");
		setBrand("");
		setWeight(0.0f);
	}

	public Laptop(String model, String brand, float weight) {
		setModel(model);
		setBrand(brand);
		setWeight(weight);
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public void giveInfo(){
		System.out.println("Model: " + super.model + ", brand: " + super.brand + ", weight: " + this.weight);
	}
}
