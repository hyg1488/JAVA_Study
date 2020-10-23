class DD implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("YO");
			try {
				Thread.sleep(500);
			}catch(Exception o){
				
			}
		}
	};
}
public class day10_01 {
	public static void main(String[] args) {
		Runnable r = new DD();
		Thread t1 = new Thread(r);	// 인터페이스를 이용하면 이렇게 사용
		Thread tread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("kk!");
					try {
						Thread.sleep(500);
					}catch(Exception o){
						
					}
				}
				
			}
		});
		
		tread.start();
		t1.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("NO");
			try {
				Thread.sleep(500);
			}catch(Exception o){
				
			}
		}
		
		
	}
}
