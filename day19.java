// 추상 클래스 : 실체가 없는 클래스, 미완성 클래스
// 객체 생성 불가
// 목적 : 통일(필드, 매서드) - 의무적으로 클래스를 사용하도록 강제할 수 있음 

public class day21 {
	public static void main(String[] args) {
//		AA a = new AA(); 추상 클래스는 미완성클래스이기 때문에 선언 불가
		BB b = new BB();
		AA a1 = new A();
		A a2 = new A(); // 상속 받으면 사용 가능, 
		// 그런데 추상 클래스를 사용하는 메리트가 없음.. 
	}

}

abstract class AA {	// 반드시 상속 받아야 쓸 수 있는 추상 클래스
	int a = 10;
	public void print() {
		System.out.println("a = " +a);
	}
}

class BB{
	int a = 10;
	public void print() {
		System.out.println("a = " +a);
	}
}

class A extends AA {
	
}


abstract class CC{	// 일반 클래스는 추상 매서드 포함 불가, 반드시 추상 클래스로
	int c = 10;
	public void print() {
		System.out.println("c = " +c);
	}
	public abstract void data();	// 추상 매서드 - 내용은 각자 알아서 채워라...
		// 추상 매서드를 의무적으로 구현해야됌(오버라이딩 해야함), 안하면 에러가 발생.
}

class C extends CC{
	public void data() {	// 오버라이딩, 추상화매서드는 오버라이딩을 안하면 오류
		
	}
}
