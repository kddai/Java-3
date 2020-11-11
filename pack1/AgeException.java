package pack1;

public class AgeException extends Exception {
	int age;
	String m;
	public AgeException(int a) {
		if(a<0) {
			m="您输入的年龄有误";
		}
	}
	public String warnMessage() {
		return m;
	}
}
