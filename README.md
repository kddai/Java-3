# Java-3
#### Java课程项目3 接口程序实验  
计G202 代旭涵 2020322111
# 阅读程序  
## 实验目的  
1.掌握Java中抽象类和抽象方法的定义；    
2.掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法;    
3.了解异常的使用方法，并在程序中根据输入情况做异常处理。   

## 实验内容  
#####  某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。  
1.设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法；  
2.设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。（其他属性及方法，可自行发挥）  
3.编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额（国家最新工资纳税标准，请自行检索）。  

## 实验要求  
1.在 博士研究生类中实现各个接口定义的抽象方法;  
2.对年学费和年收入进行统计，用收入减去学费，求得纳税额；  
3.国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义;    
4.实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入;    
5.根据输入情况，要在程序中做异常处理。  

##  核心代码  
1.博士研究生类实现学生管理接口和教师管理接两个接口。  
```  
public class Graduatestudent implements Studentmanagementinterface,Teachermanagementinterface{  
```
2.教师管理端口包括发放薪水和查询薪水的方法。
```
public interface Studentmanagementinterface {
	
	  public void Tuition();   
	  public String CheckTuition();  
	  public void Tuition1();  
	  public String CheckTuition1();  
}  
```
3.学生管理接口包括缴纳学费和查学费的方法。
```
public interface Studentmanagementinterface {  
	  public void Tuition();    
	  public String CheckTuition();    
	  public void Tuition1();    
	  public String CheckTuition1();    
}  
```
4.使用Scanner类实现运行时交互式输入。  
```
Scanner scanner = new Scanner(System.in);  
		System.out.println("输入你的姓名");  
		String Name = scanner.nextLine();  
		System.out.println("输入你的性别");  
		String Sex = scanner.nextLine();  
		System.out.println("输入你的年龄");  
		int Age = scanner.nextInt();  
		System.out.println("您输入的信息是：");  
```
5.try catch异常处理语句。  
```
try {  
		System.out.println("输入你的姓名");  
		String Name = scanner.nextLine();  
		System.out.println("输入你的性别");  
		String Sex = scanner.nextLine();  
		System.out.println("输入你的年龄");  
		int Age = scanner.nextInt();  
		System.out.println("您输入的信息是：");  
		System.out.println(Name);  
		System.out.println(Sex);  
		System.out.println(Age);  
		Graduatestudent graduate = new Graduatestudent();  
		graduate.inform();    
		}catch(Exception e) {  
			System.out.println("请检查您输入的信息是否有误");  
			scanner.close();  
		}  
    ```  
 6.年学费，年薪水，税收语句。  
 ```
 public void inform1() {  
		int Sum;    
		Sum = 3000*2;    
		int Sala;     
		Sala = 6500*12;      
		double tax;  
		tax = (Sala*0.35);    
    }  
    ```
## 显示结果
##### 最终结果  
![](https://github.com/kddai/Java-3/blob/main/photo/%E7%BB%93%E6%9E%9C.JPG)  
##### 接口异常结果  
![](https://github.com/kddai/Java-3/blob/main/photo/%E5%BC%82%E7%B1%BB%E7%BB%93%E6%9E%9C.JPG)  
## 实验感想  
今天做了几个小章节整体的实验。通过研究生的双重身份，继承教师学生实现学费和薪水等功能。还用Scanner交互式输入以及端口异常升华这次实验。  
由于这周选修课开始了，所有通过周末还有其它琐碎时间完成，虽然听了老师讲的端口异常处理知识，但是落实到实验上还是有点难，不知道从哪里下手。这次实验的try Catch语句是我咨询我们班杨昀昊同学帮助完成的，很感谢杨昀昊同学以后学习中向他想学习，积极进取。    
冲！  


    
    








