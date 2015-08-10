package hashMapStudent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in, "UTF-8");
		
		HashMap<String, Student> students = new HashMap<>();
		for(int j = 1; j <= 3; j++){
		System.out.printf("Enter first name of student %d: ", j);
		String fName = scn.next();
		System.out.print("Enter last name of student: ");
		String lName = scn.next();
		System.out.print("Enter number: ");
		int number = scn.nextInt();
		HashMap<String, ArrayList<Integer>> subjectAndMarks = new HashMap<String,ArrayList<Integer>>();
		Student newStudent = new Student();
		for(int i = 1; i <= 5; i++){
			ArrayList<Integer> marks = new ArrayList<>();
			System.out.printf("Enter name of subject %d: ", i);
			String sName = scn.next();
			System.out.print("Enter 3 marks: ");
			int m1 = scn.nextInt();
			int m2 = scn.nextInt();
			int m3 = scn.nextInt();
			marks.add(m1);
			marks.add(m2);
			marks.add(m3);
			subjectAndMarks.put(sName, marks);
			newStudent.setFirstName(fName);
			newStudent.setLastName(lName);
			newStudent.setNumber(number);
			newStudent.setMarks(subjectAndMarks);
		}
		students.put(fName, newStudent);
		}
		System.out.println(students);
		
		while(true){
			System.out.println("Menu: ");
			System.out.println("1. Add mark.");
			System.out.println("2. Calculate avarage mark.");
			System.out.println();
			System.out.print("Enter your choice: ");
			int choice = scn.nextInt();
		
			switch (choice) {
			case 1:
				System.out.print("Enter name of student: ");
				String name = scn.next();
				System.out.print("Enter name of subject: ");
				String sName = scn.next();
				System.out.print("Enter new mark: ");
				int newMark = scn.nextInt();
				if(students.containsKey(name)){
					Student std = students.get(name);
					std.addSubjectMark(sName, newMark);
					System.out.println(students);
				} else{
					System.out.println("There is no student with this name!");
				}
				break;
			case 2:
				System.out.print("Enter name of student: ");
				String studentName = scn.next();
				System.out.print("Enter name of subject: ");
				String subjectName = scn.next();
				if(students.containsKey(studentName)){
					Student student = students.get(studentName);
					float result = student.calculateAvarageMark(subjectName);
					System.out.printf("Average mark (%s): %f \n", subjectName, result);	
				}
				break;
			default:
				System.out.println("Wrong choice!!!");
				break;
			}
			System.out.println("Enter '0' for exit or onother number for continue: ");
			int exit = scn.nextInt();
			if(exit == 0){
				break;
			} else{
				continue;
			}
		}
		scn.close();
	}
}
