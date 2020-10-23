/*	(클래스 안에 클래스)
 *  중첩 클래스 :	 1. 중첩클래스(Inner)			2. 정적 중첩	
 *				 3. 지역중첩					4. 익명 중첩
 */

public class day23 {
	public static void main(String [] args) {
		System.out.println("----------- 1. 중첩 클래스 ----------");
		Outer o = new Outer();
//		Inner i = new Inner();	 이렇게는 사용 불가, 
		Outer.Inner i = o.new Inner();
		o.disp();
		System.out.println("-----------------");
		i.disp();
		
//		Inner 객체만 생성할경우
		Outer.Inner justI = new Outer().new Inner();
		justI.disp();
		System.out.println("-----------------");
		o.x = 1000;
		
		
		Outer.Inner i2 = o.new Inner();
		Outer.Inner i3 = o.new Inner();
		Outer.Inner i4 = new Outer().new Inner();
		
		i2.disp();
		i3.disp();
		i4.disp();
		
		
		
		System.out.println("----------- 2. 정적 중첩클래스 ----------");
		Outer1 ot = new Outer1();
//		ot.Inner1 = ot.new Inner1();	정적에서는 사용불가
		Outer1.Inner1 ii = new Outer1.Inner1();
		ii.disp_in();
		
		System.out.println(Outer1.Inner1.c);
//		System.out.println(Outer1.x);
//		System.out.println(Outer1.y); static 변수가 아니면 직접 졉근 불가.
		System.out.println(Outer1.s);
		
		
		
		System.out.println("----------- 3. 지역 중첩클래스 ----------");
		// 메서드가 실행 될때, 
		
		Outer2 o2 = new Outer2();
		o2.inCl();
		
		
		System.out.println("----------- 4. 익명 중첩클래스 ----------");
		// 기존 클래스의 특정 메소드를 오버라이딩하여 재정의하여 사용
		// 클래스를 또 만들지 않고 상속 받아 재정의
			Inner3 in4 = new Inner3() {
				public void aaa() {
					super.a=20;
					super.aaa();
					System.out.println("AAAAABBBBB");
				}
//				public void ccc() {} 오버라이딩이 아닌 새로운 메소드 생성 불가.
			};
			
			in4.aaa();
	}
}


class Outer{	// 1. 중첩 클래스
	int x = 100;
	private int y = 200;	// 상속이었으면 private 는 쓸수 없음.
	private static int z = 300;
	
	public Outer() {}
	public void disp() {
		System.out.println("x = "+x);
	}
	
	class Inner {
		private int k = 10;
		public void disp() {
			System.out.println("x = "+x);
			System.out.println("y = "+y);
			System.out.println("z = "+z);
		}
		
	}
}

class Outer1{	// 2. 정적 중첩클래스
	private int x =100;
	static int s = 10;
	int z = 100;
	private static int y = 200;
	public void disp() {
		System.out.println("x = "+ x);
		System.out.println("y = "+ y);
	}
	static class Inner1{
		private int a = 10;
		private static int b = 20;
		static int c = 20;
		
		public void disp_in() {
//			System.out.println("x = "+ x); private 도 static 을 붙이지 않으면
			System.out.println("y = "+ y);	// 		사용 불가
			System.out.println("a = "+a);
			System.out.println("b = "+b);
			System.out.println("c = "+c);
//			System.out.println("z = "+z); ! ERRO,	static class는 일반멤버를
//		 											포함 불가
		}
	}
}

class Outer2 {	// 3. 지역 중첩클래스
	private int x =100;
	static int s = 10;
	int z = 100;
	private static int y = 200;
	public void inCl(){
		class Inner2{
			private int a = 10;
			private int b = 20;
//			static int c = 20; static 사용 불가
			public void disp() {
				System.out.println(a+"+"+b+" = "+(a+b));
			}
		}
		Inner2 in = new Inner2();
		in.disp();
	}
	
}

class Inner3{	// 4. 익명 중첩클래스
	int a = 10;
	int b = 10;
	public void aaa() {
		System.out.println(a+b);
	}
	public void bbb() {
		System.out.println("BBBBBB");
	}
}	
