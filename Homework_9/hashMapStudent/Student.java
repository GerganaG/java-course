package hashMapStudent;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {

	private String firstName;
	private String lastName;
	private int number;
	private HashMap<String, ArrayList<Integer>> marks = new HashMap<String,ArrayList<Integer>>();
	
	public Student() {
		super();
		this.firstName = " ";
		this.lastName = " ";
		this.number = 0;
		this.marks = new HashMap<String,ArrayList<Integer>>();
	}
	
	public Student(String firstName, String lastName, int number, HashMap<String, ArrayList<Integer>> marks) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
		this.marks = marks;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public HashMap<String, ArrayList<Integer>> getMarks() {
		return marks;
	}

	public void setMarks(HashMap<String, ArrayList<Integer>> marks) {
		this.marks = marks;
	}

	public void addSubjectMark(String nameOfSubject, int newMark){
		if(marks.containsKey(nameOfSubject)){
			marks.get(nameOfSubject).add(newMark);
		}
	}
	
	public float calculateAvarageMark(String nameOfSubject){
		ArrayList<Integer> marksOfSubject = marks.get(nameOfSubject);
		float sum = 0;
		for(int i = 0; i < marksOfSubject.size(); i++){
			sum += marksOfSubject.get(i);
		}
		float avarageMark = sum/(marksOfSubject.size());
		return avarageMark;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nmae: " + this.firstName + " " + this.lastName + ", number: " + this.number + ", marks: " + this.marks;
	}
	
	
}
