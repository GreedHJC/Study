package the_5;

public class Test03 {
	/*���� 5-3 1��*/
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
	
	
	/*���� 5-3 2��*/
	public static void main(String[] args) {
		int n = 24;
		switch (n/10) {
		case 0:
			System.out.println("0�̻� 10�̸��� ��");
			break;
		case 1:
			System.out.println("10�̻� 20�̸��� ��");
			break;
		case 2:
			System.out.println("20�̻� 30�̸��� ��");
			break;
		default:
			System.out.println("���� Ȥ�� 30 �̻��� ��");
			break;
		}
	}
	
	
}
