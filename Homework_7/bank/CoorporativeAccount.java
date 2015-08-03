package bank;

import java.math.BigDecimal;

public class CoorporativeAccount extends Account {

	private String nameOfBusiness;
	private long bulstat;
	
	public CoorporativeAccount(){
		super();
		this.nameOfBusiness = "";
		this.bulstat = 0L;
	}
	
	public CoorporativeAccount(BigDecimal dollars, String nameOfBusiness, long bulstat) throws NegativeMoneyException {
		super(dollars);
		setNameOfBusiness(nameOfBusiness);
		setBulstat(bulstat);
	}
	
	public String getNameOfBusiness() {
		return nameOfBusiness;
	}

	public void setNameOfBusiness(String nameOfBusiness) {
		this.nameOfBusiness = nameOfBusiness;
	}

	public long getBulstat() {
		return bulstat;
	}

	public void setBulstat(long bulstat) {
		this.bulstat = bulstat;
	}

	public void printBulstat(){
		System.out.println("BULSTAT: " + this.bulstat);
	}	
}
