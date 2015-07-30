package employee;

public class Doctor extends Employee {

	private int nightShifts;
	private int fullTimeShifts;
	
	public Doctor(){
		super();
		this.nightShifts = 0;
		this.fullTimeShifts = 0;
	}
	
	public Doctor(int hours, int salary, int nightShifts, int fullTimeShifts){
		super(hours, salary);
		setNightShifts(nightShifts);
		setFullTimeShifts(fullTimeShifts);
	}
	
	public int getNightShifts(){
		return nightShifts;
	}
	
	public void setNightShifts(int nightShifts){
		this.nightShifts = nightShifts;
	}
	
	public int getFullTimeShifts(){
		return fullTimeShifts;
	}
	
	public void setFullTimeShifts(int fullTimeShifts){
		this.fullTimeShifts = fullTimeShifts;
	}
	
	public void printShifts(){
		System.out.println("Night-shifts: " + this.nightShifts);
		System.out.println("Full-time shifts: " + this.fullTimeShifts);
	}
	
}
