package ch18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamEx {

	public static void main(String[] args) {
		
		try {
			//DataOutputStream 은 이진파일(binary file) 처리하는 객체
			DataOutputStream dataout= new DataOutputStream(
					new FileOutputStream("c:\\test\\test.dat"));
			
			dataout.writeInt(123);//숫자 형식의 자료를 파일에 저장
			dataout.writeChar('A');//문자 형식의 자료를 파일에 저장
			dataout.writeDouble(3.5);//실수형
			dataout.close();//Stream 닫기까지 되어야 파일 완성됨
			System.out.println("저장되었습니다.");
			
			//DataInputStream : 바이너리파일 읽기 위한 객체 
			DataInputStream datain = new DataInputStream(new FileInputStream("c:\\test\\test.dat"));
			System.out.println(datain.readInt());//정수값 읽음
			System.out.println(datain.readChar());//문자값 읽음
			System.out.println(datain.readDouble());//실수값 읽음
			datain.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
