package stocks;

public class Desserts extends Stock {

	private float calories;
	private String expirationDate;
	
	public Desserts() {
		super();
		this.calories = 0.0f;
		this.expirationDate = "";
	}
	public Desserts(float price, boolean available, float calories, String expirationDate) {
		super(price, available);
		setCalories(calories);
		setExpirationDate(expirationDate);
	}
	
	public float getCalories() {
		return calories;
	}
	public void setCalories(float calories) {
		this.calories = calories;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
}
