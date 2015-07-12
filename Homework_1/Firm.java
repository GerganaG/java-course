import java.util.Scanner;

public class Firm {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in, "UTF-8");
		
		String firstName, lastName;
		long age, personalNum, telephoneNum;
		char gender;
		
		System.out.println("Enter First Name: ");
		firstName = input.nextLine();
		
		System.out.println("Enter Last Name: ");
		lastName = input.nextLine();
		
		System.out.println("Enter Age: ");
		age = input.nextLong();
		
		System.out.println("Enter Gender (M/F only): ");
		gender = input.next().charAt(0);
		
		System.out.println("Enter Personal Number: ");
		personalNum = input.nextLong();
		
		System.out.println("Enter Telephone Number +359: ");
		telephoneNum = input.nextLong();
		
		System.out.println("Enterd First Name: " + firstName);
		System.out.println("Enterd Last Name: " + lastName);
		System.out.println("Enterd Age: " + age);
		System.out.println("Enterd Gender: " + gender);
		System.out.println("Enterd Personal Number: " + personalNum);
		System.out.println("Enterd Telephone Number: +359" + telephoneNum);
		
		input.close();
		

	}

}
