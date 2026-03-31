package oops;
class Employee{
	String name;
	int id;
	double salary;
	Employee(String name,int id,double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public void displayEmployeeDetails() {
		System.out.println("---------Employee Details----------");
		System.out.println("Name: "+this.name);
		System.out.println("Id: "+this.id);
		System.out.println("Salary: "+this.salary);
	}
}
public class EmployeeDetails {
	public static void main(String[] args) {
		Employee emp=new Employee("Aakash", 1, 25000);
		emp.displayEmployeeDetails();
	}
}
