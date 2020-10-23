import java.util.*;

/*
 *	Map -> HashMap , Hashtable(동기화)
 *
 *	검색 기능이 강화된 컬렉션 (자동정렬)
 * - TreeSet , TreeMap
 *	 2진 트리 구조
 *
 *	
 *
 */
public class day08 {
	public static void main(String[] args) {
		Map <String, Integer>mp = new Hashtable<String, Integer>();
		Hashtable <String, Integer>ht = new Hashtable<String, Integer>();
		
		TreeSet <Integer> tset = new TreeSet<Integer>();
		
		tset.add(12);
		tset.add(1);
		tset.add(2);
		tset.add(5);
		tset.add(5);
		tset.add(50);
		tset.add(10);
		
		System.out.println(tset);
		
		TreeSet treeset = new TreeSet(); // <> 없으면 자동ㅇ로 Object
		
		int[] score = {85,90,50,66,75,35,67,78};
		
		for (int i = 0; i < score.length; i++) {
			treeset.add(score[i]);
		}
		System.out.println(treeset);
		
		// 75보다 작은값 찾기.  headSet
		
		System.out.println(treeset.headSet(new Integer(75)));
		
		// 75보다 큰값 찾기. tailSet
		System.out.println(treeset.tailSet(75));
		
		TreeSet<Integer> treeS = new TreeSet<Integer>();
		treeS.add(new Integer(88));
		treeS.add(new Integer(12));
		treeS.add(new Integer(24));
		treeS.add(new Integer(35));
		treeS.add(new Integer(46));
		treeS.add(new Integer(34));
		treeS.add(new Integer(19));
		
		System.out.println(".first 가장 작은 수 : "+ treeS.first());
		System.out.println(".last 가장 큰 수 : "+treeS.last());
		
		System.out.println(".higher 24점보다 한단계 높은 숫자 : "+treeS.higher(24));
		System.out.println(".lower 24점보다 한단계 낮은 숫자 : "+treeS.lower(24));
		
		System.out.println(".floor 35이거나 그보다 아래수를 찾음 : "+treeS.floor(35));
		System.out.println(".floor 60이거나 그보다 아래수를 찾음 : "+treeS.floor(60));
		
		System.out.println(".ceiling 85이거나 그보다 높은 수를 찾음 : "+treeS.ceiling(85));
		System.out.println();
		System.out.println(".pollFirst 작은수부터 꺼내오고 제거");
		while(!treeS.isEmpty()) {
			int score1 = treeS.pollFirst();
			System.out.print("꺼내온 값 : "+score1);
			System.out.println(", 남은 객체수 : "+treeS.size());
		}
	}
}
