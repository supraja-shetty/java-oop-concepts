import java.util.Scanner;
class Person{
	private int id;
	private String name;
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	public String getDetails() {
		return "id:" +id+ "Name: "+name;
	}
	
}
class emply extends Person{
	private int emplyid;
	public emply(int id,String name,int emplyid) {
		super(id,name);
		this.emplyid= emplyid;
	}
	public int getEmplyid() {
		return emplyid;
	}
	public void setEmplyid(int emplyid) {
		this.emplyid = emplyid;
	}
	@Override
	public String getDetails() {
		return super.getDetails()+"employee id: "+emplyid;
	}
}
class Manager extends emply{
	private String department;
	public Manager(int id,String name,int emplyid,String department) {
		super(id,name,emplyid);
		this.department=  department;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String getDetails() {
		return super.getDetails()+"Department: "+department;
	}
}
public class Inheritance {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of Employees:");
		int n = scan.nextInt();
		scan.nextLine();
		for(int i=0;i<n;i++) {
		String input = scan.nextLine();
		String[] data = input.split(",");
		int id = Integer.parseInt(data[0]);
		String name = data[1];
		int emplyid = Integer.parseInt(data[2]);
		String department = data[3];
		Manager m = new Manager(id,name,emplyid,department);
		System.out.print(m.getDetails());
	}
  }
}
