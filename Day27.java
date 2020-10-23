import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 *  날짜 시간 관련 클래스
 *  
 *  Date
 *  
 *  Calendard
 *  
 *  그레고리력
 *  
 */
public class day01 {
	public static void main(String[] args) {
		// date 는 잘 사용하지 않음, 권고 x
		Date time = new Date();
		System.out.println(time);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
		String date = sdf.format(time);
		System.out.println(date);
		
		// Calendar 는 인터페이스 !!!!
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; // Month 는 0 ~ 11
		int day = cal.get(Calendar.DATE);
		
		System.out.println(year+" "+month+" "+day);
		System.out.println();
		
		// 날짜 설정이 가능. 설정할때 MONTH 는 0부터 11 까지니 주의 !
		
		// 그레고리력 - 전세계 표준 (자동으로 윤년 평년 구분)
		
		GregorianCalendar gc = new GregorianCalendar();
		
		System.out.println(gc.get(Calendar.YEAR)+"년");
		System.out.println(gc.get(Calendar.MONTH)+1+"월");
		System.out.println(gc.get(Calendar.DATE)+"일");
		
		System.out.println();
		System.out.print("요일 (1~7) 1 = 일요일 : ");
		System.out.println(gc.get(Calendar.DAY_OF_WEEK));
		System.out.print("이달의 몇번째 요일인가 ? ");
		System.out.println(gc.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.print("이달의 마지막날 : ");
		System.out.println(gc.getActualMaximum(Calendar.DATE));
		System.out.print("오전, 오후 ? (0: 오전  1: 오후 ) : ");
		System.out.println(gc.get(Calendar.AM_PM));
		
		System.out.println();
		System.out.print(gc.get(Calendar.HOUR)+" : ");
		System.out.print(gc.get(Calendar.MINUTE)+" : ");
		System.out.print(gc.get(Calendar.SECOND));
		
		System.out.println();
		System.out.println("args0 : "+args[0]);
		System.out.println("args1 : "+args[1]);
		System.out.println("args2 : "+args[2]);
	
	}
}
