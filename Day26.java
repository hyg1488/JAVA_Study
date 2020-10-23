import java.io.File;
import java.util.*;

/*	Util
 * 	Random 클래스
 * 
 * 	StringTokenizer 클래스
 * 	토큰이라는 여러개의 문자열로 잘라내는데 사용		
 * 	ex) "100","200","300" ,로 구분자로 잘라내면 4개토큰
 * 
 * new Scanner(new File("경로"));
 * sc.hasNexLine -> 해당 파일이 있나? T/F
 * 
 * 문제점 1.	1 김학생 90 80 20 일때 nextInt() , next() ...
 * 
 * 문제점 2.  1,김학생,90,80,20 일때 split 이용
 * 
 *  >>>>> 문제점 3 1, 김학생 90 90, 80 일때 토크나이저 사용.
 * 
 */

public class day28 {
	public static void main(String[] args) throws Exception {
//		Scanner sc = new Scanner(new File("C:\\Users\\yungi\\Java46\\Day28\\src\\Exam.java"));
//		while(sc.hasNextLine()) {
//			System.out.println(sc.nextLine());
//		}
		
		StringTokenizer st = null;
		
		try {
			Scanner sc = new Scanner(new File("C:\\data\\test.txt"));
			while(sc.hasNextLine()) {
				int[] score = new int[3];
//				System.out.println(sc.nextLine());
				String str = sc.nextLine();
				System.out.println(str);
				int sum = 0;
				int avg = 0;
				st = new StringTokenizer(str,", ");
				
				while(st.hasMoreTokens()) {
					int ss = 0;
					int count =0;
					int k = 0;
					System.out.print(st.nextToken()+"\t");
					System.out.println("count = "+ count);
					if(count>2) {
						try {
						  k = Integer.parseInt(st.nextToken());
						}
						catch(Exception e) {
						}
						
						if(1<k && 100>k) {
							score[ss] = k;
							ss++;
						}
					}
					count ++;
					
				}
				for (int s = 0; s < score.length; s++) {
					sum += score[s];
				}
				avg = sum/3;
				
				System.out.print(sum +"\t "+ avg);
				System.out.println();
			}

		}
		
		catch(Exception e) {
			System.out.println("파일 없음.");
		}
	}
}
