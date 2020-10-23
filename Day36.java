import java.awt.Toolkit;

/*	쓰레드 구현과 실행
 * 
 * 	Thread 클래스
 * 
 * 	Runnable 인터페이스
 * 
 * synchronized () 동기화
 */
class ExamThread1 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("NO");
			try {
				Thread.sleep(500);
			}catch(Exception o){
				
			}
		}
	}
}
class ExamThread2 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("OK");
			try {
				Thread.sleep(500);
			}catch(Exception o){
				
			}
		}
	}
}
public class day10{
	public static void main(String[] args) {
		Toolkit tool = Toolkit.getDefaultToolkit();
		System.out.println("싱글 쓰레드");
		for (int i = 0; i < 5; i++) {
			tool.beep();
			System.out.println("NO");
			try {
				Thread.sleep(500);
			}catch(Exception o){
				
			}
		}
		
		for (int i = 0; i < 5; i++) {
			tool.beep();
			System.out.println("Yes");
			try {
				Thread.sleep(500);
			}catch(Exception o){
				
			}
		}
		// 이건 싱글 쓰레드.
		// 1번 작업 이 다 돌아야 2번 작업이 실행됌.
		// 멀티쓰레드로 구현시 서로 번갈아가면서 작업 - 상황에 따라 효율적으로 작업
		
		System.out.println("멀티 쓰레드");
		
		Thread th1 = new ExamThread1();
		Thread th2 = new ExamThread2();
		
		
		th1.start();
		th2.start();
		
		
		
		System.out.println("테스팅");
		
		Thread tread = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					tool.beep();
					System.out.println("!	YO");
					try {
						Thread.sleep(500);
					}catch(Exception o){
						
					}
				}
			};
		};
		
		tread.start();
		for (int i = 0; i < 5; i++) {
			tool.beep();
			System.out.println("! Ha");
			try {
				Thread.sleep(500);
			}catch(Exception o){
				
			}
		}
	}
}

class AAA extends Thread{ // 쓰레드 클래스를 상속받아 멀티쓰레드 구현
	
}

class BB{}

class BBB extends BB implements Runnable{ 
	// 이미 상속받은 값을 멀티쓰레드로 구현할때 인터페이스 Runnable을 사용
	
	@Override
	public void run() {
	}
	
}
