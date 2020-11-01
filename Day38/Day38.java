package Test2;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


class Point implements Serializable{ // 직렬화 대상으로 만듬
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "x="+x+"\t y="+y;
	}
}

public class Exam_02 {
	public static void main(String[] args) throws Exception {
		Point p1 = new Point(10,20);
		File f = new File("c:\\data\\point.txt");
		
		boolean b = f.createNewFile();
		System.out.println(b ? "파일 생성 완료":"파일 생성 실패");
		
		FileOutputStream fos = new FileOutputStream(f);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		oos.writeObject(p1);
		
		
		//여러개 객체 넣기
		
		List<Point> pl = new ArrayList<Point>();
		pl.add(p1);
		pl.add(new Point(100,200));
		pl.add(new Point(12,20));
		
		// Collection (List 등)은 자동 직렬화
		
		oos.writeObject(pl);
		
		oos.close();
	}
}
