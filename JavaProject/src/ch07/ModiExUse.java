package ch07;

public class ModiExUse {
	public static void main(String[] args) {
		ModiEx me = new ModiEx();
		System.out.println(me.name); //접근제어자를 private 했더니 에러 //The field ModiEx.name is not visible
	}
}
