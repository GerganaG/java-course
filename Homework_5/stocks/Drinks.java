package stocks;

public class Drinks extends Stock {
	
	private String name;
	private int quantity;
	
	public Drinks() {
		super();
		this.name = "";
		this.quantity = 0;
	}
	public Drinks(float price, boolean available, String name, int quantity) {
		super(price, available);
		setName(name);
		setQuantity(quantity);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
