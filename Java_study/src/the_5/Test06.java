package the_5;

public class Test06 {
	
	/*문제5-6 1번*/
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
	
	/*문제5-6 2번*/
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
	
	/*문제5-6 2번 해석*/
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
				System.out.println(num + " 더할 때 1000을 넘는다.");
				System.out.println("초과된 값: " + sum);
				break;
			}
			num++;
		}
	}
}
