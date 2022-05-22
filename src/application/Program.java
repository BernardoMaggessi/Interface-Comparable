package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();

		list.add(new Employee("Bernardo", 7500.00));
		list.add(new Employee("Ana", 3000.00));
		list.add(new Employee("Leo", 5000.00));
		list.add(new Employee("Armando", 2800.00));
		list.add(new Employee("Pedro", 3100.00));
		list.add(new Employee("Sandra", 7000.00));

		Collections.sort(list);
		for (Employee emp : list) {
			System.out.println(emp.getName() + ", " + emp.getSalary());
		}

	}

}
