package Test;

public class Employee extends Person {
	
	public int EmpId;
	public int Salary;
	static String department = "Technology";
	
	//constructor
	
	public Employee() {
		super();
		System.out.println("inside employee constructor");
	}
	
	//parameterized constructor
	
	public Employee(int empid, int salary) {
		
		this();
		this.EmpId = empid;
		this.Salary = salary;
	
	}
	
	public Employee(String name,String city, int age,int empid, int salary) {
		super(name,city,age);
		
		this.EmpId = empid;
		this.Salary = salary;
	}
	
	public void display() {
		System.out.println("Emp id is " +EmpId);
		System.out.println("Salary is " +Salary);
		System.out.println("Dep is " +Employee.department);
	}

}
