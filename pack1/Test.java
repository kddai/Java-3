package pack1;
import java.util.Scanner;

public class Test {
public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			
		try {
		System.out.println("�����������");
		String Name = scanner.nextLine();
		System.out.println("��������Ա�");
		String Sex = scanner.nextLine();
		System.out.println("�����������");
		int Age = scanner.nextInt();
		System.out.println("���������Ϣ�ǣ�");
		System.out.println(Name);
		System.out.println(Sex);
		System.out.println(Age);
		
		Graduatestudent graduate = new Graduatestudent();
		graduate.inform();
		
		}catch(Exception e) {
			System.out.println("�������������Ϣ�Ƿ�����");
			scanner.close();
		}
		
	    try {
	    Scanner scanner1 = new Scanner(System.in);
		System.out.println("�����������");
		String Name2 = scanner1.nextLine();
		System.out.println("��������Ա�");
		String Sex2 = scanner1.nextLine();
		System.out.println("�����������");
		int Age2 = scanner1.nextInt();
		System.out.println(Name2);
		System.out.println(Sex2);
		System.out.println(Age2);
		Graduatestudent graduate = new Graduatestudent();
		graduate.inform1();
		scanner1.close();
	    }catch(Exception e) {
	    	System.out.println("�������������Ϣ�Ƿ�����");
	    	 
	    	 }
	   
		}
	
		
}

