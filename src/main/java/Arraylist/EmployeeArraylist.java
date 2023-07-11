package Arraylist;

import java.util.ArrayList;

class Employees{
	int id;
	String name;
	int salary;
	public Employees(int i, String string, int j) {
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
	ArrayList<Employees> list = new ArrayList<Employees>();
    list.add(new Employees(101,"Peter",10000));
    list.add(new Employees(102,"Tony",30000));
    list.add(new Employees(103,"Steve",20000));
    list.add(new Employees(104,"Banner",50000));
    list.add(new Employees(105,"Natasha",60000));
	
    int max = list.stream().map(Employees::getSalary).max(Integer::compare).get();
	
    System.out.println("The max salary is " + max);
    
	}
}
