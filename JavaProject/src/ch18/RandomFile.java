package ch18;
//RandomAccessFile : 파일
import java.io.RandomAccessFile;

public class RandomFile {

	public static void main(String[] args) {
		
		String str = null;
		
		try {
			RandomAccessFile file = new RandomAccessFile("C:\\test\\rand.txt", "rw");
			System.out.println(file.getFilePointer());//0
			//getFilePointer() : 파일포인터 (파일을 어디까지 읽었는지 가리킴)
			file.seek(8);//8번째 인덱스 부터
			System.out.println(file.getFilePointer());//8
			file.write("HTML".getBytes());//기존 java를 HTML 로 덮어씀
			System.out.println(file.length());//문자길이값(한글은 3byte 길이값 가짐) //19 출력
			System.out.println(file.getFilePointer());//포인터는 12출력
			
			while(file.getFilePointer() < file.length()) {
				//파일의 내용보다 파일 포인터의 위치값이 적으면 반복. 파일 끝까지 가겠다는 말
				str=file.readLine();
				//한글처리
				//iso-8851-1, 8859_1 은 서유럽 언어 인코딩방식, 자바의 기본값
				//String(문자열, 캐릭터셋) 인코딩 방식 변환
				//ms949(euckr) : 2바이트(완성형), 옛날방식
				//utf-8 : 3바이트, 초성(1) 중성(1) 종성(1byte) => 조합형
				
				str = new String(str.getBytes("8859_1"), "UTF-8");//utf-8을 UTF-8로 바꿨더니 됐네... uft라고 썼구나.. 오타 시발
			}
			System.out.println(file.length());//파일 길이값 19 출력됨
			System.out.println(file.getFilePointer());//파일 포인터 위치 19 출력됨
			file.close();//파일 저장시점
			System.out.println("파일이 저장되었습니다.");
			//실행했더니 에러... 오타 고쳐서 해결함...
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
