package profit;

public class Employee {
	public String name;
	public String emp_id;
	public Salary salary;
	
	public Employee() {	
	}
	
	public Employee(String n, String id) {
		this.name = n;
		this.emp_id = id;
	}
	public String getID() {
		return emp_id;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return " "+emp_id;
	}
	

}
