/*	변수.indexof("값") : 변수안의 해당 값을 검색해서 위치 표시
 * 	변수.split("값") : 변수를 정해준 값을 기준으로 분리. ex) "_" 변수안에서 _만나면 분리
 *	변수.subString(0,4) : 변수를 0~4 번까지 분리해서 저장
 */ 
public class day26 {
	public static void main(String[] args) {
		String st = "Hello, World! Nice to meet you ~";
		int a = st.length();// 문자열 길이
		System.out.println(a);
		
		for (int i = 0; i < a; i++) {
			System.out.println(st.charAt(i));
		}
		
		int b = st.indexOf("l"); // indexof 해당 값을 검색.
		int c = st.indexOf("l",3); // ("l", 3) 3번째 자리 이후로 검색
		System.out.println(b+" "+c);
		System.out.println(st.contains("Hello")); // contains 포함 여부 검색
		
		String[] s = st.split(" "); // split : ("") 이 안에 넣는 값을 만나면 분리
			// " " 공백 "," , "_" _ "H" H만나면 분리 , 분리하면 분리한 기준값은 안나옴
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		String date = "	2020-09-28	";
		String y = date.substring(0,4);	// date 의 0 ~ 4 번을 저장
		String m = date.substring(5,7);
		String d = date.substring(8);	// date 의 8 ~ 끝까지 저장
		
		System.out.println(y);
		
		String k = date.trim(); // 앞뒤 공백을 없애줌.
		System.out.println(k);	
		
		boolean bool = true;
		int p = 10;
		String ss = String.valueOf(bool); // 값을 문자열로 저장.
		String ii = String.valueOf(p);
		System.out.println(ss+" "+p);
		System.out.println(ii+10+"문자열이기 때문에 1010이 출력");
		int aa = Integer.parseInt(ii);
		System.out.println((aa+10)+"정수로 바꿨기 때문에 20출력");
	}
}
