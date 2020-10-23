import java.util.Arrays;

/*	java.lang.*  패키지 활용
 * 
 * 	hashCode() : 일반변수는 없고 각 객체마다 존재함.
 * 
 * 	clone() : 자신을 복제, 새로운 인스턴스를 만듬 (백업용으로 주로 사용됌)
 * 	Cloneable : 인터페이스를 선언해주면 복제가능
 * 
 * 
 *  
 *  Comparable<String> : 자동 sort 기능
 *  
 *  finalize() : 소멸전 데이터가 자동 저장, DB 연결할때 주로 사용
 *  
 *  equalsIgnoreCase(String anotherString) : 비교, 대소문자 구분 x
 */
public class day25 {
	public static void main(String[] args) {
		AA a1 = new AA();
		AA a2 = new AA();
		
		boolean K = a1.x == "TEST";
		boolean T = a1.x.equals(a2.x);	// Object가 자동 상속되어 equals 사용 가능
		System.out.println(K);
		System.out.println(T);
		
		if(a1 == a2) {
			System.out.println("a1 == a2");
		}
		else {
			System.out.println("a1 ! = a2");
		}
		
		if(a1.equals(a2)) {		// 오버라이딩을 해서 비교후 동일객체로 판단한것.
			System.out.println("동일객체");
		}
		else {
			System.out.println("동일객체 아님");
		}
		
		
		System.out.println("----------- String 오버라이딩 ----------");
		B b1 = new B("홍길동", 28);
		System.out.println(b1);
		System.out.println("이름 : "+b1.name +"\t나이"+b1.age);
		
		String str = new String("홍길동");
		System.out.println("이름 : "+str); // 스트링 클래스는 toString이 오버라이딩
										 // 되있어서, 주소가 아닌 값이 출력
		System.out.println("-----------------------");
		BB b2 = new BB("홍삼", 88);
		System.out.println("-------------- hashcode -----------");
		String str1 = "AAAA";
		String str2 = "BBBB";
		String str3 = "CCCC";
		String str4 = new String("AAAA");
		
		System.out.println("str1 : " + str1.hashCode());
		System.out.println("str2 : " + str2.hashCode());
		System.out.println("str3 : " + str3.hashCode());
		System.out.println("str4 : " + str4.hashCode());
		
		C c1 = new C();
		C c2 = new C();
		System.out.println("c1 : " + c1.hashCode());
		System.out.println("c2 : " + c2.hashCode());
		// equals 와 hashcode 까지 똑같으면 완전 같은 객체로 판단.
		// hashcode 는 중복될 수 가 없음.
		// hashcode 를 오버라이딩 하면 같은 객체는 hashcode 도 같게 줄 수 있음.
		
		System.out.println();
		System.out.println("-----------------------");
		int a[] = {10,20,30,40,50,60,70,80,80};
		int b[] = new int[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		int c[] = a.clone();
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");
		}
		
		// 이걸로 .. 사용자 클래스는 복제 할 수 없음..
		// Cloneable 인터페이스를 구현해야 복제 가능.
		
		String[] stR = {"aaaa","bbbb","cccc","dddd"};
		String[] stR2 = stR.clone();
		
		// for 문을 안쓰고 배열 출력
		System.out.println();
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(stR));
		
		System.out.println("---------------------------");
		D d1 = null;
		for (int i = 0; i < 50; i++) {
			d1 = new D(i);
			d1 = null;
			System.gc();	// 이곳을 빨리 비워달라고 요청하는 명령어
		}
		
		String aa = "AAAA";
		System.out.println(aa.equalsIgnoreCase("AaaA")); // 대소문자 구분x

	}
}


class AA{	// Object 는 모든 클래스에 자동 상속.
	String x = "TEST";	// String 은 Object 에서 오버라이딩을 받아서 자동으로 equals
						// 효과가 나옴 (주소가 아닌 안에 값을 비교)

	@Override
	public boolean equals(Object obj) {	// 오버 라이딩을 하지 않으면 다른 객체로 판단
		if(obj instanceof AA) {
			AA a = (AA)obj;
			return x == a.x;
		}
		else{
			return false;
		}
	}
}


class B{
	String name;
	int age;
	
	B(String name, int age){
		this.name = name;
		this.age = age;
	}
	
}

class BB{
	String name;
	int age;
	
	BB(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "이름 : "+name+"\t나이"+age;
	}
	
}

class C{
	@Override
	public int hashCode() {	// c1 : 1829164700 이걸 선언 하지 않으면 이렇게 출력
		return 100;			// c2 : 2018699554
	}
}

class D{
	private int no;
	public D(int a) {
		this.no = a;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(no+"번 객체가 소멸합니다.");
	}
}
