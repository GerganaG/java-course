package stocks;

public class Fruits extends Stock {

	private String vitamins;
	private String typeOfFruits; 
	
	public Fruits() {
		super();
		this.vitamins = "";
		this.typeOfFruits = "";
	}
	public Fruits(float price, boolean available, String vitamins, String typeOfFruits) {
		super(price, available);
		setVitamins(vitamins);
		setTypeOfFruits(typeOfFruits);
	}
	
	public String getVitamins() {
		return vitamins;
	}
	public void setVitamins(String vitamins) {
		this.vitamins = vitamins;
	}
	public String getTypeOfFruits() {
		return typeOfFruits;
	}
	public void setTypeOfFruits(String typeOfFruits) {
		this.typeOfFruits = typeOfFruits;
	}
}
