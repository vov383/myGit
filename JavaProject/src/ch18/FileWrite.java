package ch18;

import java.io.FileOutputStream;
import java.io.OutputStream;

//항상 기준은 프로그램
//프로그램에서 파일로 쓰는 것
public class FileWrite {

	public static void main(String[] args) {
		OutputStream os = null;
		try {
			os = new FileOutputStream("C:\\test\\aa.txt");//url이 나와야함
			System.out.print("입력하세요 : ");
			while (true) {
				int ch = System.in.read();//read()는 1byte 읽음
				if(ch==13) break;//엔터키 입력시 종료
				os.write(ch);//파일에 1byte 저장
				//한번 더 실행하면 aa.txt 파일에 내용 덮어쓰기 해버림
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
