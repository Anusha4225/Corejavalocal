package Test;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp1 = new Employee();
		
		emp1.EmpId = 6789;
		emp1.Salary = 7000;
		emp1.display();
		
		Employee emp2 = new Employee(5678,8965);
		emp2.display();
		
		Employee emp3 = new Employee("anu","hyd",40,34440,7890);
		emp3.display();
		
		PolymorphismExample obj1 = new PolymorphismExample();
		
		obj1.add(12,17);
		obj1.add(12,67,98);
		obj1.add(45.99, 98.87);
		
		Account objAccount = new Account();
		objAccount.setBalance(3000);
		
		System.out.println(objAccount.getBalance());
	}

}
