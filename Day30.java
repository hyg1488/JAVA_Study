import java.util.*;

/* List -	ArrayList	( 멀티스레드 x )
 * 			Vector 		( 멀티스레드에 안전 )
 * 			LinkedList	( 삽입 삭제가 많을때 best )
 * 
 *	 Vector   
 * 	 멀티스레드에 안전
 * 
 */

public class day04 {
	public static void main(String[] args) {
		Vector v = new Vector();
		Vector v2 = new Vector(20);
		
		// capacity = 물리적 크기 (백터만 가지고 있음)
		System.out.println("기본크기 : "+v.capacity());
		System.out.println("기본크기 : "+v2.capacity());
		
		v.add(10);
		v.add("hello");
		
		System.out.println(v.elementAt(1));
		
		ArrayList al = new ArrayList();
		LinkedList ll = new LinkedList();
		
		System.out.println("순차적으로 추가");
		System.out.println(add1(al));
		System.out.println(add1(ll));
		
		System.out.println("중간에 추가");
		System.out.println(add2(al));
		System.out.println(add2(ll));
		
		System.out.println("중간에 삭제");
		System.out.println(remove1(al));
		System.out.println(remove1(ll));
		
		System.out.println("순차적으로 삭제");
		System.out.println(remove2(al));
		System.out.println(remove2(ll));
	}
	
	public static long add1(List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i <1000000; i++) list.add(i+"");
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	public static long add2(List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) list.add(500, "X");
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	public static long remove1(List list) {
		long start = System.currentTimeMillis();
		for (int i = list.size()-1; i >= 0; i--) list.remove(i);
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	public static long remove2(List list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000; i++) list.remove(i);
		long end = System.currentTimeMillis();
		return end - start;
	}
}
