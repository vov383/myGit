package ch03;

public class InCrease {
	//증감연산자	
	// i++ 과 ++i 차이점	후반영과 선반영 
	public static void main(String[] args) {
		int i = 5;
		int j = 0;
		//나중에 반영되느냐 선반영 되느냐 차이.
		j = i++;//j를 i로 초기화 한 후에 i의 값을 1증가시킴. //변수 뒤에 붙어. 후위연산자. 나중에 계산.
		
		System.out.println(i + "," + j);
		
		i = 5;
		j = ++i;
		System.out.println(i+","+j);//i를 1 증가시킴. j를 i로 초기화. //
		
	}
}
