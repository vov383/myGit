
package ch11;

public class Sinfo implements Student {
	
	private String name;
	
	@Override
	public void address(String name, String addr, String email) {
		this.name = name;
		System.out.println("============================================");
		System.out.println("이름\t주소\t이메일");
		System.out.println(name+"\t"+addr+"\t"+email);
		
	}

	@Override
	public void point(int kor, int eng, int mat) {
		int tot = kor + eng + mat;
		double avg = tot/3.0; 
		System.out.println("이름\t국어\t영어\t수학\t총점t\t평균");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+String.format("%.1f",avg));
		System.out.println("============================================");
	}


}
