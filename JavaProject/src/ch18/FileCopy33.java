package ch18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileCopy33 {


	public static void main(String[] args) {

		try {
			int var=0;
			
			InputStreamReader isr = new InputStreamReader(System.in);
			
			
			System.out.print("내용을 입력하세요 : ");
			String str = "";//문자열 처리 변수 선언
			
			BufferedWriter writer1 = null;
			BufferedReader reader = null;
			BufferedWriter writer2 = null;
			
			String file1="C:\\test\\abc.txt";//원본파일 url
			String file2="c:\\test\\abcCopy.txt";//복사본
			
			writer1 = new BufferedWriter(new FileWriter("C:\\test\\abc.txt"));//쓰고
			reader = new BufferedReader(new FileReader(new File(file1)));
			writer2 = new BufferedWriter(new FileWriter(new File(file2)));
			while(true) {
				var = isr.read();
				if(var==13) 
					break;
				System.out.println(var + "==>"+(char)var);
				writer1.write(var);
			}
			
			while(true) {
				str = reader.readLine();//한 라인을 읽음
				if(str==null) break;//내용이 없으면 종료 해라
				
				writer2.write(str+"\r\n");
			}
			System.out.println("파일 복사가 완료되었습니다.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

