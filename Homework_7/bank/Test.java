package bank;

import java.math.BigDecimal;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		
		try {
			Account personal = new PersonalAccount(new BigDecimal(100), "Pesho", 9507183295L);
			Account coorporative = new CoorporativeAccount(new BigDecimal(10000000), "CSC", 303030L);
			Scanner scn = new Scanner(System.in, "UTF-8");
			//Account personal2 = new PersonalAccount(new BigDecimal(-10), "Ivan", 9309163217L);
			System.out.print("Personal: ");
			isAccount(personal);
			System.out.print("Coorporative: ");
			isAccount(coorporative);
			System.out.print("Scanner: ");
			isAccount(scn);
			//isAccount(personal2);
		} catch (InvalidAccountException e){
			System.out.println(e.getMessage());
		} catch (NegativeMoneyException e){
			System.out.println(e.getMessage());
		} 

	}

	public static void isAccount(Object obj) throws InvalidAccountException, NegativeMoneyException{
		if(!(obj instanceof Account)){
			throw new InvalidAccountException("Invalid account!");
		} else {
			if(obj instanceof PersonalAccount){
				((PersonalAccount) obj).printUcn();
			} else{
				((CoorporativeAccount) obj).printBulstat();
			}
		}
	}
}
