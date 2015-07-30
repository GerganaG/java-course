package cats;

public class Cat {

	protected String name;
	protected int age;
	
	public Cat(){
		this.name = "";
		this.age = 0;
	}
	
	public Cat(String name, int age){
		this();
		
		setName(name);
		setAge(age);
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void say(){
		System.out.print("Name: " + this.name + "\t");
		System.out.println("Age: " + this.age);
	}
	
}

