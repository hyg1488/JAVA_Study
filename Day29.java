
import java.util.*;

/*
 * 	컬렉션 프레임웍 ( Collections Framework).
 * 	원리는 배열과 같지만 크기 자동 조절, 어떤 타입도 다 들어감 (전부 오브젝트로 들어감.)
 * 
 * 	List , set , map
 * 	List => ArrayList , Vector(동기화) , LinkedList(비상연락망)
 * 	ArrayList 와 	Vector 은 거의 비슷하나 Vector 는 동기화 되어있어서 멀티스레이드를 지원
 * 	동시작업시 문제    	동시작업 가능
 * 
 *  >> ArrayList <<
 *  
 */

public class day03 {
	public static void main(String[] args) {
		List list = new ArrayList();	// 기본적으로 16공간 확보
//		ArrayList aList = new ArrayList(10);
		// List 는 상속해준 것들만 사용 가능, ArrayList 는 자기 자신이기에 더 많은 매서드 사용
		
		list.add(100);
		list.add("Java");
		list.add(3.14);
		list.add('a');
		
		System.out.println("List : "+ list);
		System.out.println(list.get(1));
		list.add(1,"추가");
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
			Object a = list.get(i);
			System.out.println(a);
			
//			int score = (int) list.get(i);	문자열은 int 로 변환 불가, 오류 발생
		}
		
		// 해결 : 전용 클래스를 생성할 수 있음
		
		List <Integer>intList = new ArrayList<Integer>();
		// <Integer> 지네릭타입
		
		intList.add(100);
//		intList.add("100"); 	정수전용 공간이라 문자열 추가시 오류.
//		intList.add(1.1);		실수도 불가능.
		
		List <String>strList = new ArrayList<String>();
		
		strList.add("Java");
		strList.add("DB");
		strList.add("WEB");
		strList.add(0,"WEB");
		strList.add(0,"WEB");
		
		System.out.println(strList);
		
		strList.remove(0);
		strList.set(0, "Oracle");
		System.out.println(strList);
		
		System.out.print("확장For\t: ");// 확장 for
		for(String str : strList) {
			System.out.print(str+"\t");
		}
		System.out.println();
		
		System.out.print("반복자\t: ");// 반복자
		Iterator<String> iter = strList.listIterator();
		while(iter.hasNext()) {
			String s = iter.next();
			System.out.print(s+"\t");
		}
		
		System.out.println();
		Collections.sort(strList);	// String은 A ~ B 자동 정렬, 숫자도 자동정렬
		System.out.println(strList);
		
		
		List<Integer> iList = new ArrayList<Integer>();
		iList.add(101);
		iList.add(122);
		iList.add(134);
		iList.add(135);
		iList.add(166);
		iList.add(112);
		iList.add(124);
		iList.add(164);
		iList.add(199);
		
		Collections.sort(iList);	// 오름차순으로 자동 정렬
		System.out.println(iList);
	}
}
