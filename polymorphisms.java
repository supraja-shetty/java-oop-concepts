import java.util.Scanner;
class Employee{
	public void Calculatesalary() {
		
	}
}
class manger extends Employee{
	@Override
	public void Calculatesalary() {
		System.out.print("The manger salary is $34000");
	}
}
class Programmer extends Employee{
	@Override
	public void Calculatesalary() {
		System.out.print("The prpgrammer salary is $57000");
	}
	
}

public class Polymorphisms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		manger m = new manger();
		Programmer p = new Programmer();
		Employee emp;
		if(s.equalsIgnoreCase("manger")) {
			emp = m;
			m.Calculatesalary();
			
		}
		else {
			emp = p;
			p.Calculatesalary();
		}
		

	}

}
