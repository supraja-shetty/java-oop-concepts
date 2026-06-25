import java.util.Scanner;
abstract class Animal{
	public abstract void sound();
}
class Lion extends Animal{
	@Override
	public void sound() {
		System.out.println("Roar");
	}
	
}
class Tiger extends Animal{
	@Override
	public void sound() {
		System.out.println("Growl");
	}
}
 class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s= scan.nextLine();
		Animal a;
		if(s.equals("Lion")) {
			a = new Lion();
			a.sound();
		}
		else {
			a = new Tiger();
			a.sound();
		}

	}

}
