import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
public class CollectorsDemo {
public static void main(String args[]) {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("Alex", 23, 23000));
		employeeList.add(new Employee("Ben", 63, 25000));
		employeeList.add(new Employee("Dave", 34, 56000));
		employeeList.add(new Employee("Jodi", 43, 67000));
		employeeList.add(new Employee("Ryan", 53, 54000));
		long count = employeeList.stream()
				.filter(emp -> emp.getAge() > 30)
				.collect(Collectors.counting());
		System.out.println(count);
		// Using summingInt() method to get the sum of salaries of all employees.
		//int count = employeeList.stream().collect(Collectors.summingInt(emp->emp.getSalary()));
		int count1=employeeList.stream().filter(emp->emp.getName().startsWith("A")).mapToInt(emp->emp.getSalary()).sum();
		System.out.println(count1);
		Optional<Employee> min=employeeList.stream().collect(Collectors.minBy(Comparator.comparing(emp->emp.getSalary())));
		System.out.println(min.get().getName());
		int sum = employeeList.stream().mapToInt(emp->emp.getSalary()).sum();
		System.out.println(sum);
		}
	}
	class Employee {
		String name;
		int age;
		int salary;
		Employee(String name) {
		this.name = name;
	}
	Employee(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		return "Employee{" +
		"name='" + name + '\'' +
		", age=" + age +
		", salary=" + salary +
		'}';
	}
}