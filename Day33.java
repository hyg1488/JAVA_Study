
import java.util.ArrayList;
import java.util.List;
enum Car {A,B,C,D};	//상수, 요일이나 특정 문자를 이렇게 만들어서 사용.

/*
 * 	지네릭스
 * 
 * 	열거형 - 요일같은 특정 데이터를 선언해서 사용
 * 
 * 	애너테이션 = @Override 같은 정보를 제공하는 용도
 */

public class day07 {
	public static void main(String[] args) {
		List <Integer> ll = new ArrayList<Integer>();
		
		ll.add(123);
		ll.add(456);
		
		box b = new box(new AA()); 	// <U>로 지정되었어서 U가 AA로 지정됌
		
		Person <Tv, String> p = new Person<Tv, String>();
		p.setkind(new Tv());
		p.setModel("삼성");
		
		System.out.println(p.getKind().num);
		System.out.println(p.getKind().name);
		
		Person <Car, Tv> p2 = new Person <Car, Tv>();
		
		System.out.println(Car.A);
		Car c1 = Car.D;
		System.out.println(c1);
	}
}

class box <U>{	// 무엇이 들어올지 모르니 특정타입을 지정해서 방지. 자동변환을 해줌
	U obj;
	box(U obj){
		this.obj = obj;
	}
}

class Person <T, M>{
	T kind;
	M model;
	
	public T getKind() {
		return kind;
	}
	
	public M getModel() {
		return model;
	}
	public void setkind(T kind) {
		this.kind = kind;
	}
	
	public void setModel(M model) {
		this.model = model;
	}
}

class Tv{
	int num = 1;
	String name = "캉";
	
}


class AA{
	static final double PI = 3.14;
	public double getPI() {
		return PI;
	}
}
