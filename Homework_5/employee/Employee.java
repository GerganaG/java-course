package employee;

public class Employee {
	
	protected int hours;
	protected int salary;
	
	public Employee(){
		this.hours = 0;
		this.salary = 0;
	}
	
	public Employee(int hours, int salary){
		this();
		
		this.hours = hours;
		this.salary = salary;
	}
	
	public int getHours(){
		return hours;
	}
	
	public void setHours(int hours){
		this.hours = hours;
	}
	
	public int getSalary(){
		return salary;
	}
	
	public void setSalary(int salary){
		this.salary = salary;
	}
	
	public void printData(){
		System.out.println("Hours per month: " + this.hours);
		System.out.println("Salary: " + this.salary);
	}
	
	
}
