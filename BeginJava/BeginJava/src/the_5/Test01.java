package the_5;

public class Test01 {
	
	/*���� 5-1 */
//	public static void main(String[] args) {
//		int num= 120;
//		
//		if(num>0&& num%2==0) {
//				System.out.println("����̸鼭 ¦��");
//		}
//	}
	
	/*���� 5-2 */
	public static void main(String[] args) {
		int num=320;
		
		if(num<0) {
			System.out.println("0 �̸�");
		}else if(num >= 0 && num < 100){
			System.out.println("0�̻� 100�̸�");
		}else if(num >= 100 && num < 200){
			System.out.println("100�̻� 200�̸�");
		}else if(num >= 200 && num < 300){
			System.out.println("200�̻� 300�̸�");
		}else
			System.out.println("300�̻�");
		
	}
	
	
}
