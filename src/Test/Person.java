package Test;

public class Person {
	public String Name;
	public int age;
	public String city;
	
	public Person() {
		
	}
	
	public Person(String name, String city , int age) {
		
		this.Name = name;
		this.age = age;
		this.city = city;
	}
	
	public void display() {
		
		System.out.println("Name is " +Name);
		System.out.println("Age is " +age);
		System.out.println("City is "+city);
	}

}
