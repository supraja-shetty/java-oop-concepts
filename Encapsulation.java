import java.util.Scanner;
class Employee{
	private int id;
	private String name;
	private double salary;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Employee e = new Employee();
		e.setId(sc.nextInt());
		
		e.setName(sc.next());
		e.setSalary(sc.nextDouble());
		
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSalary());

	}

}
