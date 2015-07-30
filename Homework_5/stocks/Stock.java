package stocks;

public abstract class Stock {
	
	protected float price;
	private boolean available;
	
	public Stock(){
		this.price = 0.0f;
		this.available = false;
	}
	
	public Stock(float price, boolean available){
		this();
		setPrice(price);
		setAvailable(available);
	}
	
	public float getPrice(){
		return price;
	}
	
	public void setPrice(float price){
		this.price = price;
	}
	
	public boolean getAvailable(){
		return available;
	}
	
	public void setAvailable(boolean available){
		this.available = available;
	}

}
