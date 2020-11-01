import java.io.*;

public class Exam01 {
	public static void main(String[] args) throws Exception {
		File f1 = new File("c:\\data\\hel.txt");
		if(f1.exists()) {
			f1.deleteOnExit();	// 실행후 자동삭제
			f1.mkdir();	// 파일이 없으면 생성 
			System.out.println("파일명 : "+f1.getName());
			System.out.println("파일 경로 : "+f1.getPath());
			System.out.println("파일 경로 : "+f1.getParent());
			System.out.println("파일 크기 : "+f1.length());
			System.out.println("최종 수정일 : "+f1.lastModified());
		}else {
			System.out.println(f1.getName() + " 파일이 존재 x ");
		}
		
		
		File f = new File("c:\\data");
		String[] fList = f.list();
		for (int i = 0; i < fList.length; i++) {
			System.out.println(fList[i]);
		}
		
		File[] flist2 = f.listFiles();
		for (int i = 0; i < flist2.length; i++) {
			if(flist2[i].isFile()) {
				System.out.println("파일 : "+flist2[i].getName());
			}
			System.out.println(flist2[i]);
		}
		
		File f2 = new File("c:\\data\\test!!.txt");
		try {
			FileOutputStream fos = new FileOutputStream(f2);
			byte by[] = {66,67,68,(byte)'!'};
			fos.write(by);
			fos.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		File f3 = new File("c:\\data\\test.txt");
		try {
			FileInputStream fis = new FileInputStream(f3);
			byte[] by = new byte[1024];
			int count = fis.read(by);
			for (int i = 0; i < count; i++) {
				System.out.println(i + ":"+(char)by[i]);
			}
		}catch(Exception e) {
			
		}
		
		DataOutputStream dos = 
				new DataOutputStream(
						new BufferedOutputStream(
								new FileOutputStream(
										new File("c:\\data\\test.txt"))));
		
		DataInputStream dis = 
				new DataInputStream(
						new BufferedInputStream(
								new FileInputStream(
										new File("c:\\data\\test.txt"))));
		
		
		int a = dis.readInt();
		double b = dis.readDouble();
		byte[] by = new byte[10];
		dis.read(by);
		
		System.out.println("a = " +a);
		System.out.println("b = " +b);
		System.out.println("by = " + new String(by));
		
	}
}
