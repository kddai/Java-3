package pack1;

 public class Graduatestudent implements Studentmanagementinterface,Teachermanagementinterface{
	 public void Tuition() {
			System.out.println("4600");
		}
		public String CheckTuition() {
			return "4600";
		}
		public void Salary() {
			System.out.println("8000");
		}
		public String CheckSalary() {
			return "8000";
		}
		public void Tuition1() {
			System.out.println("3000");
		}
		public String CheckTuition1() {
			return "3000";
		}
		public void Salary1() {
			System.out.println("6500");
		}
		public String CheckSalary1() {
			return "6500";
		}
	 public String Name;
	 public String Sex;
	 public String Age;
	 public double TermFee;
	 public int Sala;
	 public String setName(String Name) {
		this.Name = Name;
		return Name;
	}
	
	public String setSex(String Sex) {
		this.Sex = Sex;
		return Sex;
	}
	public String setAge(String Age) {
		this.Age = Age;
		return Age;
	}
	public void setTermFee(double TermFee) {
		this.TermFee = TermFee;
	}
	public double getTermFee() {
		return TermFee;
	}
	
	public void inform() {
		int Sum;
		Sum = 4600*2;
		int Sala;
		Sala = 8000*12;
		double tax;
		tax = (Sala*0.45);
		System.out.println("每学期学费："+CheckTuition()+"\n"+
						   "一学年学费："+Sum+"\n"+
						   "每月薪水："+CheckSalary()+"\n"+
						   "每年薪水："+Sala+"\n"+
						   "应收年税额:"+tax+"\n");
		System.out.println("---------------------------------------------");
	}
	public void inform1() {
		int Sum;
		Sum = 3000*2;
		int Sala;
		Sala = 6500*12;
		double tax;
		tax = (Sala*0.35);
		System.out.println("每学期学费："+CheckTuition1()+"\n"+
						   "一学年学费："+Sum+"\n"+
						   "每月薪水："+CheckSalary1()+"\n"+
						   "每年薪水："+Sala+"\n"+
						   "应收年税额:"+tax+"\n");
		System.out.println("---------------------------------------------");
	}
	
	
	
	//public void Tax() {
		//double TaxSalary;
		//if(Sala>=0 && Sala<1500) {
			//TaxSalary = (double) (Sala*0.03);
	//}else if(Sala>=1500 && Sala<4500) {
			//TaxSalary = (double) (Sala*0.1);
 	//}else if (Sala>=80000 && Sala<100000) {
 			//TaxSalary = (double) (Sala*0.45);
 			//}
}
	
	
	


	

