package patterns;

import java.util.HashSet;
import java.util.Set;

public class Employee {
	private String name;

	public Employee(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Set<Employee> employees = new HashSet<>();
		employees.add(new Employee("Mike"));
		employees.add(new Employee("Mike"));
		employees.add(new Employee("John"));

		System.out.println(employees.size());

	}

	public String getName() {
		return name;
	}

}
