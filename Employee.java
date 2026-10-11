package javacon.demo;

public class Employee {
	private int id;
	private String name;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void display() {
		System.out.println("emp id: "+id);
		System.out.println("emp name :"+name);
		System.out.println("emp salary : "+salary);
	}

}
