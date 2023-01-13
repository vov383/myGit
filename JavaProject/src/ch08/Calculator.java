package ch08;

public class Calculator {
	private int left;
	private int right;
	
	public Calculator() { //ctrl + space 누르면 기본생성자로 안내해줌.
		System.out.println("기본 생성자 호출...");
	}
	
	
	public Calculator(int left, int right) { //개발자가 만든 생성자.
		//개발자가 생성자를 만들었다면 컴파일러가 기본생성자를 안 만들어줘. 
		//다른 생성자를 만들 시에는 기본생성자를 호출 할 경우 개발자가 명시적으로 처리 하여야.
		System.out.println("매개변수가 있는 생성자 호출...");
		this.left = left;
		this.right = right;
	}
	//getter setter
	public int getLeft() {
		return left;
	}


	public void setLeft(int left) {
		this.left = left;
	}


	public int getRight() {
		return right;
	}


	public void setRight(int right) {
		this.right = right;
	}
	public void sum() {
		System.out.println(left+right);
	}
	public void avg() {
		System.out.println((left+right)/2);
	}
	
	
	
	
	
}
