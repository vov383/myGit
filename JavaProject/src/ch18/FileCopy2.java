package ch18;
//01-10 과제1
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class FileCopy2 {

	public static void main(String[] args) {

		String file1="c:\\test\\abc.txt";//원본파일 url
		int var=0;
		OutputStream os = null;
		InputStreamReader isr = new InputStreamReader(System.in);

		try {
			os = new FileOutputStream("c:\\test\\abc.txt");
			System.out.println("입력하세요 : ");
			while (true) {
				var = System.in.read();
//				var = isr.read();이게 왜 안될까... isr로 입력하면 될줄 알았는데 이걸하면 오히려 깨지네
				
				if(var==13) break;//엔터키 입력시 종료
				os.write(var);//
			}
			System.out.println("파일이 저장되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String str = "";//문자열 처리 변수 선언
		BufferedReader reader = null;
		BufferedWriter writer = null;
		
		String file2="c:\\test\\abcCopy.txt";//복사본

		try {
			reader = new BufferedReader(new FileReader(new File(file1)));//읽고
			writer = new BufferedWriter(new FileWriter(new File(file2)));//쓰고
			while(true) {
				str = reader.readLine();//한 라인을 읽고
				if(str==null) break;//내용이 없으면 종료

				writer.write(str+"\r\n");
			}
			System.out.println("파일 복사가 완료되었습니다.");
			//실행해보면 파일 복사됨

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(reader != null) reader.close();
				//리소스를 썼으면 닫아
				//닫을 때는 finally 절에서
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


