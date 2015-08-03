package bank;

import java.math.BigDecimal;

public class Account {

	private BigDecimal dollars;
	
	public Account(){
		this.dollars = new BigDecimal(0);
	}
	
	public Account(BigDecimal dollars) throws NegativeMoneyException {
		setDollars(dollars);
	}
	
	public void setDollars(BigDecimal dollars) throws NegativeMoneyException {
		if(this.dollars.compareTo(new BigDecimal(0)) >= 0){
			this.dollars = dollars;
		} else {
			throw new NegativeMoneyException("Negativ money!!!");
		}
	}
	
	public BigDecimal getDollars() {
		return dollars;
	}

}
