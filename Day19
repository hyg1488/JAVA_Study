// A. 상속(inheritance)
// 생성자 , private 는 상속 불가
// 멤버변수, 멤버메소드만 상속 가능

// class [상속받을 클래스명] extends [상속하는 클래스 명] - 상속

// 명시적 초기화 - 직접 값을 줘서 초기화
// 묵시적 초기화 - 자동 초기화

// B. 생성자의 연속 호출
// 상속받은 객체를 호출하면,  조상 클라스가 먼저 만들어져 호출되고 그다음 호출.
public class day20 {
	public static void main(String[] args) {
		System.out.println("---------- 상속 ----------");
		A a = new A();
		A.s = 20;
		System.out.println(A.s);
		
		AA aa = new AA();
		System.out.println(aa.s);
		a.a = 100;
		aa.print();
		
		a.s = 20;
		aa.s = 100;
		System.out.println(aa.s +" " +a.s);
		
		System.out.println();
		System.out.println("-- default 와 상속의 관계 --");
		BB bb = new BB();
		
		System.out.println();
		System.out.println("-- spuer.a 를 이용한 은닉상태 값 찾기 --");
		CC cc = new CC();
		cc.print();
		System.out.println();
		cc.ccprint();
		System.out.println();
		cc.found();
		
		System.out.println();
		System.out.println("----- 오버라이딩 ------");
		DD dd = new DD();
		dd.print();
		dd.found();
		
		System.out.println();
		System.out.println("-- 조상을 이용해 자식 생성 --");
		E e = new EE();	//	조상을 이용해 자식을 만드는건 가능
		e.a = 100;		//	자신이 물려준 값들만 접근 가능
		e.print();		//	부모는 하나 자식은 많은 경우, 이걸로 통제가 가능.
		
//		EE ee = new E();	자식을 이용해서 조상을 만드는건 불가능

		System.out.println();
		System.out.println("--- 업캐스팅, 다운캐스팅 ---");
		F f = new F();
		F ff = new FF(); // 업캐스팅
		F fff = new FFF();
		FF f2 = (FF)ff; // 다운캐스팅
//		FFF f3 = new ff(); 이렇게 선언하는 것은 아예 불가능
//		FFF f3 = (FFF)new ff(); 이거도 불가능 - 런타임 오류
		
		f.print();
		ff.print();
		fff.print();
	}
}

class A{
	static int s = 10;
	int a = 10;	// 멤버(인스턴스)변수
	int b = 20;
//	A(){
//		
//	}
//	A(int a, int b){
//		this.a = a;
//		this.b = b;
//	} 					생성자는 상속 x
	
	public void print() {
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
	}
}

class AA extends A{
	AA(){
		
	}
	AA(int a, int b){
		this.a = a;
		this.b = b;
	}
}


class B{
	int a;
	int b;
	

	B(int a, int b){
		this.a = a;
		this.b = b;
	}
	//default 생성자가 없으면 상속 불가 -
	
	B(){
		System.out.println("B() 호출"); // super() 을 이용하면 default를 호출 x
	} //해결법 1. default 생상자를 생성
}

class BB extends B{
	int c;
	
	BB(){
		super(1,2);// 해결법 2. 실제 있는 생성자를 불러주면 상속 오류 x
		System.out.println("BB() 호출");
	}
	void print() {
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		System.out.println("c = "+ c);
	}
	
}

class C{
	int a = 10;
	int b = 20;
	
	void print() {
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
	}
}

class CC extends C{
	int a = 100; // 은닉 상태 - 자식 클래스에서 똑같은 변수를 만들어 숨겨진 변수
	int c = 200;
	void ccprint() {
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		System.out.println("c = "+ c);
	}
	void found() {
		System.out.println("a = "+ super.a);
		System.out.println("b = "+ super.b);
		
	}
}


class D{
	int a = 10;
	int b = 20;
	
	void print() {
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
	}
}

class DD extends D{
	int a = 100; 
	int b = 200;
	int c = 300;
	@Override // 어노테이션 - 해당 코드가 어노테이션한 것과 이상이 없는지 확인해줌.
	          // ex) print()의 이름을 바꾸면 오버라이딩이 아니기때문에 오류로 표시됌.
	
	void print() {			// 오버라이딩(매소드 재정의) - 
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		System.out.println("c = "+ c);
	}
	void found() {
		super.print();
		
	}
}


class E{
	int a = 10;
	
	void print() {
		System.out.println("a = "+ a);
	}
}

final class EE extends E{ 	// final 을 붙이면 더이상 상속 불가능.
							// 변수에 final을 쓰면 상수 (불변값)
	int a = 200;
	int c = 300;
	@Override 
	void print() {
		System.out.println("a = "+ a);
		System.out.println("c = "+ c);
	}
	
	void eeprint() {
		System.out.println("c = "+c);
	}
	
	void found() {
		super.print();
		
	}
}


class F{
	int b = 20;
	
	void print() {
		System.out.println("b = "+ b);
	}
}

class FF extends F{
	int a = 100;
	
	void print() {
		System.out.println("a = "+ a);
	}

}

class FFF extends FF {
	int c = 30;
	void print() {
		System.out.println("c = "+ c);
	}
}

