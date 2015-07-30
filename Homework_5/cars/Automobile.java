package cars;

public class Automobile extends Car{

	private double fuelConsumption;
	
	
	public Automobile(){
		super();
		this.fuelConsumption = 0.0d;
	}
	
	public Automobile(int price, double fuelConsumption){
		super(price);
		setFuelConsumption(fuelConsumption);
	}
	
	public double getFuelConsumption(){
		return fuelConsumption;
	}
	
	public void setFuelConsumption(double fuelConsumption){
		this.fuelConsumption = fuelConsumption;
	}
	
	public void printConsumption(){
		System.out.println("Fuel Consumption: " + this.fuelConsumption);
	}
}
