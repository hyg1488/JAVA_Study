import java.util.*;

/*
 *  Stack	- 클래스.
 *  	push, pop
 *  Queue	- 인터페이스
 *  	offer, poll
 *  
 *  
 *  Collection - list set map
 *  
 *  Set 인터페이스 - Hashset	순서가 없으므로 반복자로 변환해서 가져옴
 *  
 *  
 */
public class day05 {
	public static void main(String[] args) {
		Stack stack = new Stack();
		Queue q = new LinkedList();
		
		stack.push("Stack : A");
		stack.push("Stack : B");
		stack.push("Stack : C");
		stack.push("Stack : D");
		stack.push("Stack : E");
		stack.push("Stack : F");
		
		System.out.println("====\tStack\t=======");
		String str = (String)stack.peek(); // peek - 맨위의 값 출력
		System.out.println(str);
		System.out.println("남은 데이터 : "+stack.size());
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop()); 
			// pop 값을 받아오고 삭제
		}
		System.out.println("남은 데이터 : "+stack.size());
		
		q.offer("q : A");
		q.offer("q : B");
		q.offer("q : C");
		q.offer("q : D");
		q.offer("q : E");
		q.offer("q : F");
		
		System.out.println("====\tQueue\t=======");
		str = (String) q.peek();
		System.out.println(str);
		System.out.println("남은 데이터 : "+q.size());
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		System.out.println("남은 데이터 : "+q.size());
		
		System.out.println("====\tSET\t=======");
		
		Set <String>set = new HashSet<String>(); // 순서 x 중복 x
		set.add("JAVA");
		set.add("C");
		set.add("C++");
		set.add("JavaScript");
		set.add("Python");
		set.add("Python"); // 중복 x 이므로 추가 x
		
		System.out.println(set);
		Iterator <String> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		Set s = new LinkedHashSet(); // 순서 유지, 중복 x
		s.add("1");
		s.add("2");
		s.add("3");
		s.add("4");
		s.add("1"); //중복 x
		s.add(1);	// int 1 이랑 String 1 이랑 다른거로 인식 중복으로 안봄
		
		System.out.println(s);
		
		for (Object obj : s) {
			System.out.println(obj);
		}

	}
}
