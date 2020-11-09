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
	 public String Name;
	 public String Sex;
	 public String Age;
	 public double TermFee;
	 public double CheckSalary;
	 public double YearSalary;
	 
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
	public void setYearSalary(double YearSalary) {
		this.YearSalary = YearSalary;
	}
	public double getYearSalary() {
		return CheckSalary*12;
	}
	public void inform() {
		int Sum;
		Sum = 4600*2;
		int Sala;
		Sala = 8000*12;
		System.out.println("每学期学费："+CheckTuition()+"\n"+
						   "一学年学费："+Sum+"\n"+
						   "每月薪水："+CheckSalary()+"\n"+
						   "每年薪水："+Sala+"\n");
	}
	
	
	
}

	

