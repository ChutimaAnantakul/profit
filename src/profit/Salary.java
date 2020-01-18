package profit;
public class Salary {
	public Sales sales;
	public double salary;
	public double commission;
	public double agent;
	Sales sale;
	
	public Salary(double sa) {
		this.salary = sa;	
	}
	
	public double getAmount() {
		return salary;
	}

	public double calCommission(double sale, double salary) {
		if(sale>=50001) {
			agent = (sale*(3.0/100));
			commission = salary + agent;
		}else if(sale >= 25001) {
			agent = (sale*(2.0/100));
			commission = salary + agent;
		}else if(sale >= 18001) {
			agent = (sale*(1.0/100));
			commission = salary + agent;
		}else if(sale >= 1) {
			agent = (18000*(1.0/100));
			commission = salary + agent;
		}
		return commission;
	}
	
	public String toString() {
		return "    " +commission ;
	}
	
}
