package the_5;

public class Test03 {
	/*문제 5-3 1번*/
//	public static void main(String[] args) {
//		int n = 3;
//		
//		if(n==1) {
//			
//			System.out.println("Simple Java");
//		}else if(n==2) {
//			System.out.println("Funny Java");
//		}else if(n==3) {
//			System.out.println("Fantastic Java");
//		}else {
//			System.out.println("The best programming language");
//		}
//		
//		System.out.println("Do you like coffee?");
//	}
	
	
	/*문제 5-3 2번*/
	public static void main(String[] args) {
		int n = 24;
		switch (n/10) {
		case 0:
			System.out.println("0이상 10미만의 수");
			break;
		case 1:
			System.out.println("10이상 20미만의 수");
			break;
		case 2:
			System.out.println("20이상 30미만의 수");
			break;
		default:
			System.out.println("음수 혹은 30 이상의 수");
			break;
		}
	}
	
	
}
