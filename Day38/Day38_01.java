package Test2;
import java.io.*;
import java.util.*;

public class Exam_03 {
	public static void main(String[] args) {
		
		File f = new File("c:\\data\\point.txt");
		try {
			FileInputStream fis = new FileInputStream(f);
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(bis);
			
			System.out.println(ois.readObject());
			
			Object obj = ois.readObject();
			List ll = (List) obj;
			System.out.println(ll);
//			Point p = (Point) obj;
//			System.out.println(p.x);
//			System.out.println(p.y);
			
			ois.close();
		} catch(ClassNotFoundException cnfe){
			cnfe.printStackTrace();
		}catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}catch(IOException io) {
			io.printStackTrace();
		}finally {
			System.out.println("에러가 나든 안나든 반드시 실행 ~");
		}
		
	}
}
