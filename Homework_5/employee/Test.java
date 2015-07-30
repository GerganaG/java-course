package employee;

public class Test {

	public static void main(String[] args) {
		
		Policeman chief = new Policeman(160, 3000, "Chief of police");
		
		System.out.println("Policeman: ");
		chief.printData();
		chief.printRank();
		
		System.out.println();
		
		Doctor dentist = new Doctor(170, 1000, 4, 0);
		
		System.out.println("Doctor: ");
		dentist.printData();
		dentist.printShifts();
		
	}

}
