package the_5;

public class Test06 {
	
	/*����5-6 1��*/
//	public static void main(String[] args) {
//		int num;
//		int count =0;
//		
//		for(num=1; num<=100; num++)
//		{
//			if(num%5!=0 || num%7!=0)
//				continue;
//			
//			count++;
//			System.out.println(num);
//		}
//		
//		System.out.println("Count : " + count);
//	}
	
	/*����5-6 2��*/
//	public static void main(String[] args) {
//		int num=0, hap=0;
//		
//		while(true)
//		{
//			num++;
//			if(num%2==1 || num%6==0) {
//				hap += num;
//				if(hap>=1000) {
//					System.out.println(num);
//					break;
//				}
//			}
//		}
//		System.out.println(hap);	
//
//	}	
	
	/*����5-6 2�� �ؼ�*/
	public static void main(String[] args) {
		int sum=0, num=1;
		
		while(true)
		{
			if(num%2!=0)
			{
				sum+=num;
			}else
			{
				if(num%3==0) {
					sum+=num;
				}
			}
			if(sum>1000)
			{
				System.out.println(num + " ���� �� 1000�� �Ѵ´�.");
				System.out.println("�ʰ��� ��: " + sum);
				break;
			}
			num++;
		}
	}
}
