package stocks;

public class Meat extends Stock {
	
	private float weight;
	private String type;
	
	public Meat(){
		super();
		this.weight = 0.0f;
		this.type = "";
	}
	
	public Meat(float price, boolean available, float weight, String type){
		super(price, available);
		setWeight(weight);
		setType(type);
	}
	
	public float getWeight(){
		return weight;
	}
	
	public void setWeight(float weight){
		this.weight = weight;
	}
	
	public String getType(){
		return type;
	}
	
	public void setType(String type){
		this.type = type;
	}
	
}
