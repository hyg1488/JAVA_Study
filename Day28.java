import java.text.*;
import java.time.*;
import java.util.Date;

/*
 * 	형식화
 * 	
 * 	DecimalFormat
 * 	
 * 	SimpleDateFormat
 * 
 *  MessageFormat
 *  
 *  java.time 패키지
 *  
 *  LocalDate	LocalTime
 *  
 */
public class day02 {
	public static void main(String[] args) {
		int a = 123456789;
		int b = 1;
		DecimalFormat df = new DecimalFormat("0,000 원");
		String s = df.format(a);
		String s2 = df.format(b);
		System.out.println("0을 썼을때");
		System.out.println(s);
		
		System.out.println("0을 썼을때 문제점");
		System.out.println(s2);
		System.out.println("===================================");
		DecimalFormat df2 = new DecimalFormat("\u00A4 #,###.00 원");
		String s3 = df2.format(b);
		String s4 = df2.format(a);

		
		// df.parse();
		System.out.println("숫자로 다시 변환");
		System.out.println(s4 + " 을 다시 숫자로 형변환");
		try {
			Number n = df2.parse(s4);
			System.out.println(n);
		}catch(Exception e) {
			
		}
		
		// DecimalFormat 다른 명령어들
		
		double num = 1234561.57;
		DecimalFormat df3 = new DecimalFormat("0");
		String ss = df3.format(num);
		System.out.println(ss);
		
		System.out.println("===================================");
		System.out.println("SimpleDateFormat");
		Date today = new Date();
		SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		sdf2 = new SimpleDateFormat("a hh시 mm분 ss.s초");
		System.out.println(sdf1.format(today));
		System.out.println(sdf2.format(today));
		
		// MessageFormat = 하나를 제외하고 나머지 내용이 똑같을때 사용
		
		String id = "user01";
		String name = "김학생";
		String tel = "010-4111-1234";
		
		String[] mem = {"user01", "김학생", "010-4111-1234"};
		String str = " ID :"+ id +" 이름 :"+name+" 전화 :"+tel;
		System.out.println(str);
		
		String message = "ID : {0} 이름 : {1} 전화 : {2} \n 내용 \n내용\n 내용";
		String result = MessageFormat.format(message,id,name,tel);
		String result2 = MessageFormat.format(message,mem);
		System.out.println(result);
		System.out.println(result2);
		
		// LocalDate , LocalTime
		
		LocalDate toda = LocalDate.now();
		System.out.println("현재 날짜 : "+toda);
		LocalTime lt = LocalTime.now();
		System.out.println("현재 시간 : "+lt);
	}
}
