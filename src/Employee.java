
public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	public Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int newSalary) {
		salary = newSalary;
	}
	
	public int getAnnualSalary() {
		return 12*salary;
	}
	
	public int raiseSalary(int percent) {
		return salary *= 1+percent/100;
	}
	
	public String toString() {
		return "Employee[Id=" + id + " FirstName =" + firstName + "Salary =" + salary + "]";
	}
	
}
