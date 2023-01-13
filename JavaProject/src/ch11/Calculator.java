package ch11;

public interface Calculator {
	
	public int plus(int i, int j);
	public int multiple(int i, int j);
	default int exec(int i, int j) { //jdk1.8 부터 가능.
		return i+j;
	}
	
}
