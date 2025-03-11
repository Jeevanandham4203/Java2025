package STREAMTASKUSINGFUNCTION;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RetunEmployeeAge {

	public static void main(String[] args) {
		Employee emp1=new Employee("Jeva", 24, 40000);
		Employee emp2=new Employee("karthik", 29, 30000);
		Employee emp3=new Employee("manoj", 26, 35000);
		Employee emp4=new Employee("poovu", 25, 45000);
		List<Employee>employee=Arrays.asList(emp1,emp2,emp3,emp4);
		//find the Employee ages between 25 to 35.
		AgeRange range=new AgeRange();
		System.out.println(range.findRange(employee,25,35));
		//find the Employee Max name length.
		Namelength Namelength=new Namelength();
		System.out.println("Max length of: "+Namelength.findLength(employee));
		//find Least 3 value
		LeastAge ThreeAge=new LeastAge();
		System.out.println("Find least Three: "+ThreeAge.FindLeast(employee));
	}

}

//find the employee whose ages are between 25 to 35.
class AgeRange {
	public   List<Employee> findRange(List<Employee> employee,int minAge,int maxAge){
		return employee.stream()
				.filter(x->x.getAge()>minAge&&x.getAge()<maxAge).toList();
		
	}
}

//max length of name.
class Namelength {
	public Employee findLength(List<Employee> employee){
//		return employee.stream()
//				.map(x->x.getName().length())
//				.sorted(Comparator.reverseOrder()).findFirst().get();
		return employee.stream()
				.max(Comparator.comparingInt(x->x.getName().length())).get();
	}
}

//get least 3ages of employee
class LeastAge{
	public List<Employee> FindLeast(List<Employee> employee) {
		return employee.stream()
		.sorted(Comparator.comparingInt(x->x.getAge()))
		.limit(3)
		.collect(Collectors.toList());
	}
}

class Employee {
	private String name;
	private int age;
	private int salary;
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
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	public Employee(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
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
	
}