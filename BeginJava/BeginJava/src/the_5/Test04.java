package the_5;

public class Test04 {
	/*���� 5-4 1��*/
//	public static void main(String[] args) {
//		int hap = 0, num = 1;
//		
//		
//		while (num<100) {
//			hap += num;
//			num++;
//			
//		}
//		System.out.println(hap);
//	}

	
	
	/*���� 5-4 2��*/
//	public static void main(String[] args) {
//		int num =1;
//		
//		do {
//			System.out.println("���� : " + num);
//			num++;
//			
//		}while(num<=100);
//
//		do {
//			num--;
//			System.out.println("���� : " + num);
//			
//		}while(num>1);
//	}
	
	/*���� 5-4 3��*/
	public static void main(String[] args) {
		int num = 1;
		int hap = 0;
		while(num<=1000) {
			if(num%2==0 && num%7==0) {
			hap +=num;
			
			System.out.println("1000������ �ڿ��� 2�� ��� & 7�� ��� : " + num);
			}
		num++;
		}
		System.out.println("1000������ �ڿ��� 2�� ��� & 7�� ����� �� :" + hap);

		
	}
	
	
	
}
