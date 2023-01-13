package ch18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopy {

	public static void main(String[] args) {
		
		//복사본 <== (OutputStream)[프로그램](InputSream) <== 원본
		String str = "";//문자열 처리 변수 선언
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		String file1="c:\\test\\aa.txt";//원본파일 url
		String file2="c:\\test\\b.txt";//복사본
		
		try {
			reader = new BufferedReader(new FileReader(new File(file1)));//읽고
			writer = new BufferedWriter(new FileWriter(new File(file2)));//쓰고
			while(true) {
				str = reader.readLine();//한 라인을 읽음
				if(str==null) break;//내용이 없으면 종료 해라
				
				//파일을 기록할 때는 \r\n을 다 써주어야 줄바꿈 처리 됨. 캐리지 리턴 캐리지 라인
				// \r carriage return(캐리지 리턴) 타자기에서 엔터 누르면 드르륵 해서 다시 왼쪽으로 이동하던 방식에서 유래
				// \n newLine(줄바꿈)
				writer.write(str+"\r\n");
			}
			System.out.println("파일 복사가 완료되었습니다.");
			//실행해보면 파일 복사됨
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(reader != null) reader.close();
				//리소스를 썼으면 닫아주는 것이 좋다. 
				//리소스를 닫을 때는 finally 절에서 개별적으로 닫는 것이 좋음.
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if(writer != null) writer.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		
	}
}
