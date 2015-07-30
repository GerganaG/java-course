package cars;

public class SUV extends Car{

	private boolean offHighway;
	
	public SUV(){
		super();
		this.offHighway = false;
	}
	
	public SUV(int price, boolean offHighway){
		super(price);
		setOffHighway(offHighway);
	}
	
	public boolean getOffHighway(){
		return offHighway;
	}
	
	public void setOffHighway(boolean offHighway){
		this.offHighway = offHighway;
	}
	
	public void printOffHighway(){
		System.out.println("Off-Highway" + this.offHighway);
	}
}
