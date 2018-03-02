package chapter06;

class Tv3{
	String color;
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp(){
		++channel;
	}
	void channelDown(){
		--channel;
	}
}

public class The03_TvTest3 {
	public static void main(String[] args) {
		Tv3 t1 = new Tv3();
		Tv3 t2 = new Tv3();
		System.out.println("t1의 채널값은 "+ t1.channel + "입니다.");
		System.out.println("t2의 채널값은 "+ t2.channel + "입니다.");
		t2= t1;														//t1이 저장하고 있는 값(주소)를 t2에 저장한다.
		t1.channel = 7;
		System.out.println("t1의 채널 값을 7로 변겹하였습니다.");

		System.out.println("t1의 채널값은 "+ t1.channel + "입니다.");
		System.out.println("t2의 채널값은 "+ t2.channel + "입니다.");
	}
}
