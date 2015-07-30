package convert;

public class Converter {
	
	private double degrees;
	
	public Converter() {
		this.degrees = 0.0f;
	}
	
	public Converter(double degrees) {
		setDegrees(degrees);
	}
	
	public double getDegrees() {
		return degrees;
	}


	public void setDegrees(double degrees) {
		this.degrees = degrees;
	}


	public double convert(double degrees){
		double f = (degrees * 9 / 5) + 32;
		return f;
	}

}
