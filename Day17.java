/*
 *  객체는 생성자가 있어야 생성, static 정적 변수
 *  싱글톤
 *  
 *  상수(final) 고정된 값으로 변경이 불가능
 *  
 */

class FF{
	int s = 100;
	final int Max = 100; // new 를 써야 사용가능
	static final int staticMax = 100; // new를 쓰지 않아도 사용 가능
}


class DD{
	int x =100;
	private DD() {
		
	}
	private static DD instance = new DD();
	
	public static DD getInstance() {
		return instance;
	}
}
public class day17 {
	public static void main(String[] args) {
		DD d1 = DD.getInstance(); // 싱글톤
		DD d2 = DD.getInstance(); // 동일한 개체를 가르키고 있는 것들
		// DB를 연결할때 연결하고 끊고 반복하는게 아니라 항상 연결되게 할때 사용
								  
		ss s1 = new ss();
		ss s2 = new ss();
		
		if(d1 == d2) {
			System.out.println("d1==d2");
		}
		else {
			System.out.println("xx");
		}
		if(s1 == s2) {
			System.out.println("s1==s2");
		}
		else {
			System.out.println("xx");
		}
		
		FF f = new FF();
		f.s = 200;
//		f.Max = 200; 상수는 변경 불가능, 오류 발생
		
		int b = 0;
		AA a = new AA();
		a.add(1,2);
		a.add(1,2,3);
		a.add(1,2,3,4,2,2);
		
	
		s1.a = 100;
		s1.b = 100;
		s1.test();
		s2.test(); // static 변수는 바뀌는 값도 함께 공유
		
		s1.test2();
		s2.test2(); // 일반 변수는 바뀌어도 공유 x
		
		s1.t = 100;
		s1.test3();
		s2.test3();
	}
	
	//정적 멤버 (static)	
	public void test2(){
		int b;
		
	}
}

class ss{
	int b =10;
	static int a;
	static int t;
	static int e;
	static { // 정적 초기화 블럭
		t = 10;
		e = 10;
	}

	
	public void test() {
		System.out.println("a = "+a);
	}
	public void test2() {
		System.out.println("b = "+ b);
	}
	public void test3() {
		System.out.println("t = "+ t);
	}
}
