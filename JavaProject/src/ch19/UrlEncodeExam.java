package ch19;

import java.net.URLDecoder;
import java.net.URLEncoder;

public class UrlEncodeExam {

	public static void main(String[] args) {
		
		try {
			String str = "김철수";
			System.out.println(URLEncoder.encode(str, "utf-8"));
			//URLEncoder.encode(String, encoding type) <== 어떤 값을 인코딩해서 암호화
//			console : %EA%B9%80%EC%B2%A0%EC%88%98

			//복호화도 있다. 디코딩
			
			System.out.println(
					URLDecoder.decode("%EA%B9%80%EC%B2%A0%EC%88%98", "utf-8"));
//			console : 김철수
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
