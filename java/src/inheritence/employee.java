package inheritence;
public class employee extends person{ 
	private double annualsalary;
	private int yearofjoining;
	private String nationalInsuranceNo;
	
	public employee(String name,double annualsalary,int yearofjoining,String nationalInsuranceNo){
		
		super(name);
		this.annualsalary=annualsalary;
		this.yearofjoining=yearofjoining;
		this.nationalInsuranceNo=nationalInsuranceNo;
	}
	
	void display() {
		
		System.out.println("Name : "+name+"\n"+"Annual Salary : "+annualsalary+"\n"+"Year Of joining : "+yearofjoining+"\n"+"National Id : "+nationalInsuranceNo);
		
	}

	/*public double getAnnualsalary() {
		return annualsalary;
	}

	public void setAnnualsalary(double annualsalary) {
		this.annualsalary = annualsalary;
	}

	public int getYearofjoining() {
		return yearofjoining;
	}

	public void setYearofjoining(int yearofjoining) {
		this.yearofjoining = yearofjoining;
	}

	public String getNationalInsuranceNo() {
		return nationalInsuranceNo;
	}

	public void setNationalInsuranceNo(String nationalInsuranceNo) {
		this.nationalInsuranceNo = nationalInsuranceNo;
	}*/
	
	
	
}