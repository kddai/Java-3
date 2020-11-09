package pack1;
import java.util.Scanner;

public class Test {
public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入你的姓名");
		String Name = scanner.nextLine();
		System.out.println("输入你的性别");
		String Sex = scanner.nextLine();
		System.out.println("输入你的年龄");
		String Age = scanner.nextLine();
		System.out.println("您输入的信息是：");
		System.out.println(Name);
		System.out.println(Sex);
		System.out.println(Age);
		Graduatestudent graduate = new Graduatestudent();
		graduate.inform();
		
		System.out.println("输入你的姓名");
		String Name1 = scanner.nextLine();
		System.out.println("输入你的性别");
		String Sex1 = scanner.nextLine();
		System.out.println("输入你的年龄");
		String Age1 = scanner.nextLine();
		System.out.println("您输入的信息是：");
		System.out.println(Name1);
		System.out.println(Sex1);
		System.out.println(Age1);
		Graduatestudent graduate1 = new Graduatestudent();
		graduate1.inform();
		
}
}
