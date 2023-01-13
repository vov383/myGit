package ch18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class BufferedWriterEx {

	public static void main(String[] args) {
		
//		PrintStream ps = System.out;
//		OutputStream os = ps;
//		OutputStreamWriter osw = new OutputStreamWriter(ps);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		//한줄로 처리하면
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			bw.write("환영합니다\n");
			bw.write("java\n");
			bw.write("World!!");
			bw.newLine();//BufferedWrite가 제공하는 개행처리 메서드
			bw.flush();
			bw.close();//Scanner 처럼 close()까지 해주는 것이 좋다.
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
