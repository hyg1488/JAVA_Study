import java.util.*;


public class day06 {
	public static void main(String[] args) {
		Set <String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("C++");
		set.add("C#");
		set.add("Python");
		set.add("Java Script");
		set.add("Oracle");
		
		List <String>sl = new ArrayList<String>(set);
		Collections.sort(sl);
		
		System.out.println(sl);
		int i = 0;
		for(String str : sl) {
			i++;
			str = str+" 는 "+i+"번째 언어";
			System.out.println(str);
		}
		
		System.out.println("\n총 "+sl.size()+"개의 데이터가 있으며");
		System.out.println(i+"개의 데이터를 꺼내 확인하였음");
		
		Set<AA> setA = new HashSet<AA>();
		
		setA.add(new AA(5,"AAA"));
		setA.add(new AA(5,"AAA"));
		setA.add(new AA(5,"AAA"));
		
		List<AA> lsA = new ArrayList<AA>();
		System.out.println(setA);
		Collections.sort(lsA);
	
	}
}

class AA implements Comparable<AA> { // 우리가 만든 클래스 정렬 기능
	int bun;
	String name;
	
	public AA(int bun, String name){
		this.bun = bun;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return bun+" "+name;
	}

	@Override
	public int compareTo(AA b) {
		if(bun<b.bun) {
			return -1;
		}
		else if(bun == b.bun) {
			return 0;
		}
		else {
			return 1;
		}
	}
