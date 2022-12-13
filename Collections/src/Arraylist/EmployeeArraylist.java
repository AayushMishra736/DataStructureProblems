package Arraylist;

import java.util.ArrayList;

class Employee{
	int id;
	String name;
	int salary;
	public Employee(int i, String string, int j) {
	 this.id = i;
	 this.name = string;
	 this.salary = j;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	
	
}


public class EmployeeArraylist {

	public static void main(String[] args) {
	ArrayList<Employee> list = new ArrayList<Employee>();
    list.add(new Employee(101,"Peter",10000));
    list.add(new Employee(102,"Tony",30000));
    list.add(new Employee(103,"Steve",20000));
    list.add(new Employee(104,"Banner",50000));
    list.add(new Employee(105,"Natasha",60000));
	
    int max = list.stream().map(Employee::getSalary).max(Integer::compare).get();
	
    System.out.println("The max salary is " + max);
    
	}
}
