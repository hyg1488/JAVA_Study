import java.util.Scanner;
import com.a;


//static import
import static java.lang.Math.abs;
import static java.lang.System.out;

// import & package
//
// System => java.lang.* < 이 패키지는 자동으로 imoprt 중이므로 선언 x
// https://www.oracle.com/java/technologies/javase-documentation.html
// Documentation - > 자바 메뉴얼
//

// 접근 제어자
// private < default(선언이 없으면 자동으로 할당) < protected < public
//

class ss{
	private int privateInt = 10;
	int a = 20;
	protected int protectedInt = 30;
	public int publicInt = 40;
	static int s = 20;
	
	public void test() {
		System.out.println("p = "+privateInt);
		System.out.println("a = "+a);
		System.out.println("p = "+protectedInt);
		System.out.println("d = "+publicInt);
		System.out.println("d = "+publicInt);

	}
}

public class Day18 {
	public static void main(String[] args) {
		ss s = new ss();
		Scanner sc = new Scanner(System.in);
		s.a = 30;
//		s.privateInt = 60; private 는 자신의 클라스에서는 사용가능하지만 그밖에서는 사용불가
		s.publicInt = 60;
		s.protectedInt = 70;
		a pack = new a();
		
		pack.d = 30; 
//		protected 는 상속 관계에 있거나 같은 패키지에 있으면 사용가능
//		보통 멤버 변수는 private 로 막아놓음. 멤버변수에 public 을 주는 경우는 거의없음
		
		out.print("tst"); // static import 를 이용해서 System 생략 가능
						  // 단 정적 메소드만 사용가능
		
	}
}
