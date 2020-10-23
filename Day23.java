import java.util.Scanner;

// 예외처리 (Exception), Error
// 예외 미루기 throws
// IOException , 최상위 처리 > Exception

public class day24_01 {
	public static void main(String[] args) {
		AA a = new AA();
		try {
			a.test();
		}
		catch(Exception e) {
			System.out.println("숫자만 입력");
		}
		
		System.out.printf("%o", 16);
	}
}

class AA{
	Scanner sc = new Scanner(System.in);
	public void test() throws Exception{
		int a = sc.nextInt();
		System.out.println(a);
		// throw 강제로 예외를 만듬. 책 488.p 
		
		
	}
	
}
