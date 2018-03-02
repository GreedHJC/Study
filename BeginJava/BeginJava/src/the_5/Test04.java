package the_5;

public class Test04 {
	/*문제 5-4 1번*/
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

	
	
	/*문제 5-4 2번*/
//	public static void main(String[] args) {
//		int num =1;
//		
//		do {
//			System.out.println("숫자 : " + num);
//			num++;
//			
//		}while(num<=100);
//
//		do {
//			num--;
//			System.out.println("숫자 : " + num);
//			
//		}while(num>1);
//	}
	
	/*문제 5-4 3번*/
	public static void main(String[] args) {
		int num = 1;
		int hap = 0;
		while(num<=1000) {
			if(num%2==0 && num%7==0) {
			hap +=num;
			
			System.out.println("1000이하의 자연수 2의 배수 & 7의 배수 : " + num);
			}
		num++;
		}
		System.out.println("1000이하의 자연수 2의 배수 & 7의 배수의 합 :" + hap);

		
	}
	
	
	
}
