package the_5;

public class SwitchBasic {
	public static void main(String[] args) {
		int n =3;
		
		switch (n) {
		case 1:
			System.out.println("Simple Java");
			break;
		case 2:
			System.out.println("Funny Java");
		case 3:
			System.out.println("Fantastic Java");

		default:
			System.out.println("The best programming language");
			break;
		}
		
		System.out.println("Do you like coffee?");
	}
}
