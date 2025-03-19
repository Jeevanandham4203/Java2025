package CollectionFunctionTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReturnEmployeeDetails {

	public static void main(String[] args) {
		Employee emp1=new Employee("Jeeva", 24, 40000,"male");
		Employee emp2=new Employee("karthik", 29, 30000,"male");
		Employee emp3=new Employee("Jeeva", 26, 35000,"male");
		Employee emp4=new Employee("poovu", 25, 45000,"male");
		List<Employee>employee=Arrays.asList(emp1,emp2,emp3,emp4);
		//get a Age between 25to35
		System.out.println("Age is between 25 to 35:");
		System.out.println(Employee.filterEmployeesByAge(employee));
		System.out.println();
		//get the employee name max length
		System.out.println("Max length of Employee:");
		System.out.println(Employee.findMaxLength(employee));
		System.out.println();
		//find least three ages
		System.out.println("Least three Ages:");
		System.out.println(Employee.LeastAges(employee));
		System.out.println();
		//Greater 20 age name and salary
		System.out.println("Greater than 20 age maleemloyee name& salary:");
		System.out.println(Employee.MaleEmployeesalaryandname(employee));
		System.out.println();
		//get all Employee name and count
		System.out.println("get all employee name and count:");
		System.out.println(Employee.NameAndCount(employee));
		System.out.println();
		//get count of duplicate names
		System.out.println("count of duplicate names:");
		System.out.println(Employee.duplicatecount(employee));
		System.out.println();
	}

}

class Employee {
	private String name;
	private int age;
	private int salary;
	private String Gender;
	//get a Age between 25to35
	public static List<Employee> filterEmployeesByAge(List<Employee> employes) {
	    List<Employee>result = new ArrayList<>();
	    for(Employee e : employes) {
	    	if(e.getAge()>=25&&e.getAge()<=35)
	    		result.add(e);
	    }
	    return result;
	}
	//get the employee name max length
	public static Employee findMaxLength(List<Employee> employees) {
	    Employee longNameEmployee = null;
	    int maxLength = 0;
	    for (Employee e : employees) {
	        if (e.getName().length() > maxLength) {
	            maxLength = e.getName().length();
	            longNameEmployee = e;
	        }
	    }
	    return longNameEmployee;
	}
	//find least Three ages
	public static List<Integer> LeastAges(List<Employee> employees) {
	    List<Integer> ages = new ArrayList<>();
	    for (Employee e : employees) {
	        ages.add(e.getAge());
	    }
	    Collections.sort(ages);
	    return ages.stream().limit(3).toList();
	    
	}
	//Greater 20 age name and salary
	public static Map<String, Integer> MaleEmployeesalaryandname(List<Employee> employees) {
	    Map<String, Integer> result = new HashMap<>();
	    for (Employee e : employees) {
	        if (e.getAge() > 20 && e.getGender().equals("male")) {
	            result.put(e.getName(), e.getSalary());
	        }
	    }
	    return result;
	}
	//get all Employee name and count
	public static Map<String, Integer> NameAndCount(List<Employee> employees) {
	    Map<String, Integer> nameCount = new HashMap<>();
	    for (Employee e : employees) {
	        nameCount.put(e.getName(), nameCount.getOrDefault(e.getName(), 0) + 1);
	    }
	    return nameCount;
	}
	//get count of duplicate names
	public static int duplicatecount(List<Employee> employees) {
	    Map<String, Integer> nameCount = new HashMap<>();
	    for (Employee e : employees) {
	        nameCount.put(e.getName(), nameCount.getOrDefault(e.getName(), 0) + 1);
	    }
	    int duplicateCount = 0;
	    for (int count : nameCount.values()) {
	        if (count > 1) {
	            duplicateCount++;
	        }
	    }
	    return duplicateCount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", Gender=" + Gender + "]";
	}
	public Employee(String name, int age, int salary, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		Gender = gender;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	
}