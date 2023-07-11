package Arraylist;

import java.util.Arrays;
import java.util.List;

class Employee {

	private long id;
	private String name;
	private int salary;
	private String department;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Employee(long id, String name, int salary, String department) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ","
				+ " name=" + name + ","
				+ " salary=" + salary + ","
				+ " department=" + department + "]";
	}
}

public class MaxSalary {
	
	public static void main(String args[]) {
		List<Employee> employees = Arrays.asList(
				new Employee(101, "Manish", 5000, "IT"),
				new Employee(109, "Atul", 3000, "HR"),
				new Employee(111, "Santosh", 4400, "IT"),
				new Employee(109, "Rupendra", 3200, "FIN")
				);
		
     int max = employees.stream().map(Employee::getSalary).max(Integer::compare).get();
	}
}
