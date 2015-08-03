package bank;

import java.math.BigDecimal;

public class PersonalAccount extends Account{

	private String name;
	private long ucn;
	
	public PersonalAccount(){
		super();
		this.name = "";
		this.ucn = 0L;
	}
	
	public PersonalAccount(BigDecimal dollars, String name, long ucn) throws NegativeMoneyException{
		super(dollars);
		setName(name);
		setUcn(ucn);
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getUcn() {
		return ucn;
	}
	public void setUcn(long ucn) {
		this.ucn = ucn;
	}
	
	public void printUcn(){
		System.out.println("UCN: " + this.ucn);
	}
}
