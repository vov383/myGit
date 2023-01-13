package ch18;
//0110 과제2
import java.io.RandomAccessFile;

public class RandomFile2 {

	public static void main(String[] args) {
		
		String str = null;
		
		try {
			RandomAccessFile file = new RandomAccessFile("C:\\test\\rand2.txt", "rw");
			System.out.println(file.getFilePointer());//0
			
			file.seek(9);//
			System.out.println(file.getFilePointer());//9
			file.write("park".getBytes());//기존 kim을 park으로 덮어쓰기
			System.out.println(file.length());//문자길이값(한글은 3byte 길이값 가짐) //13 출력
			System.out.println(file.getFilePointer());//포인터는 13출력
			
			while(file.getFilePointer() < file.length()) {
				//파일의 내용보다 파일 포인터의 위치값이 적으면 반복
				str=file.readLine();
				
				str = new String(str.getBytes("8859_1"), "UTF-8");//utf-8로
			}
			System.out.println(file.length());//파일 길이값 13 출력됨
			System.out.println(file.getFilePointer());//파일 포인터 위치 13 출력됨
			file.close();//파일 저장시점
			System.out.println("파일이 저장되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
