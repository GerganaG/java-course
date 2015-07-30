package employee;

public class Policeman extends Employee {

	private String rank;
	
	public Policeman(){
		super();
		this.rank = "";
	}
	
	public Policeman(int hours, int salary, String rank){
		super(hours, salary);
		setRank(rank);
	}
	
	public String getRank(){
		return rank;
	}
	
	public void setRank(String rank){
		this.rank = rank;
	}
	
	public void printRank(){
		System.out.println("Rank: " + this.rank);
	}
	
	
	
}
