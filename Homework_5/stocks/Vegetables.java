package stocks;

public class Vegetables extends Stock {

	private String kindOfVegetables;
	private String origin;
	
	public Vegetables(){
		super();
		this.kindOfVegetables = "";
		this.origin = "";
	}
	
	public Vegetables(float price, boolean available, String kindOfVegetables, String origin){
		super(price, available);
		setKindOfVegetables(kindOfVegetables);
		setOrigin(origin);
	}
	
	public String getKindOfVegetables(){
		return kindOfVegetables;
	}
	
	public void setKindOfVegetables(String kindOfVegetables){
		this.kindOfVegetables = kindOfVegetables;
	}
	
	public String getOrigin(){
		return origin;
	}
	
	public void setOrigin(String origin){
		this.origin = origin;
	}
	
	
}
