import java.util.Scanner;

public class Firm {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		
		String FirstName, LastName;
		long Age, PersonalNum, TelephoneNum;
		char Gender;
		
		System.out.println("Enter First Name: ");
		FirstName = input.nextLine();
		
		System.out.println("Enter Last Name: ");
		LastName = input.nextLine();
		
		System.out.println("Enter Age: ");
		Age = input.nextLong();
		
		System.out.println("Enter Gender (M/F only): ");
		Gender = input.next().charAt(0);
		
		System.out.println("Enter Personal Number: ");
		PersonalNum = input.nextLong();
		
		System.out.println("Enter Telephone Number: ");
		TelephoneNum = input.nextLong();
		
		System.out.println("Enterd First Name: " + FirstName);
		System.out.println("Enterd Last Name: " + LastName);
		System.out.println("Enterd Age: " + Age);
		System.out.println("Enterd Gender: " + Gender);
		System.out.println("Enterd Personal Number: " + PersonalNum);
		System.out.println("Enterd Telephone Number: +359" + TelephoneNum);
		
		input.close();
		

	}

}
