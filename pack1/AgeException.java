package pack1;

public class AgeException extends Exception {
	int age;
	String m;
	public AgeException(int a) {
		if(a<0) {
			m="���������������";
		}
	}
	public String warnMessage() {
		return m;
	}
}
