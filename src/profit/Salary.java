package profit;

public class Salary {

	public double salary;
	public double commission;
	public double sales;
	public double agent;
	
	
	public Salary(double sa) {
		this.salary = sa;
		
	}
	
	public double getAmount() {
		return salary;
	}
	public void calAgent() {
		if(sales>=50001) {
			agent = ((sales/100)*3);
		}else if(sales >= 25001) {
			agent = ((sales/100)*2);
		}else if(sales >= 1) {
			agent = ((sales/100)*1);
		}
		
	}
	public void calCommission() {
		
		commission = salary + agent;
	}
	public String toString() {
		return " "+commission;
	}
	

}
