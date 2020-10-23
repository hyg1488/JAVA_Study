// 추상클래스 : 미완성 설계도
// 인터페이스 : 기본 설계도 - 명세서

public class day22 {
	public static void main(String[] args) {
		AAA a = new AAA();
//		AA aa = new AA(); 인터페이스는 객체 생성 불가능함으로 이렇게도 사용 불가
		
		B b = new BB();
		int s = b.add(10, 10);
		System.out.println("s = "+s);
		int m =b.mul(10,10);
		System.out.println("m = "+m);
		
		System.out.println("---------------------");
		b = new BBB();
		s = b.add(10, 10);
		System.out.println("s = "+s);
		m =b.mul(10,10);
		System.out.println("m = "+m);
		
/*
 *  D22_1 에 익명 구현 개체에대해 다룸.
 */
	}
	
}

interface AA{
	public static final double PI = 3.14; // 상수만 선언 가능
//	int a; 일반 멤버변수는 선언 불가
	public void method(); // 추상메소드
	
	default void method1() { // default 메소드
		
	}
	
	static void method2(int x, int y) {	// 정적 메소드
		
	}
}

class AAA implements AA{ 	// 구현은 interface 를 class 로 사용 
							//(상속은 extends 구현은 implements )
	@Override
	public void method() {
		
	}
}

interface B{
	public int add(int m, int n );
	
	public int mul(int m, int n );
	
	default void print() {
		System.out.println("인터페이스 테스트");
	}
}

class BB implements B{
	@Override
	public int add(int m, int n) {
		return m+n;
	}
	@Override
	public int mul(int m, int n) {
		return m*n;
	}
	@Override
	public void print() {
		B.super.print();
		System.out.println("구형객체 테스트");
	}
}

class BBB implements B{
	int k = 10;
	@Override
	public int add(int m, int n) {
		return m+n+k;
	}
	@Override
	public int mul(int m, int n) {
		return m*n*k;
	}
}
