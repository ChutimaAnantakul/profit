package profit;

import java.util.ArrayList;
import java.util.Scanner;

public class ProfitDemo {

		// TODO Auto-generated method stub
		static Scanner in = new Scanner(System.in);
		static ArrayList<Employee>em = new ArrayList<Employee>();
		static ArrayList<Salary>sa = new ArrayList<Salary>();
		static ArrayList<Sales>sales = new ArrayList<Sales>();
		public static void main(String[] args) {
		int ch;
		char ye;
		
		do {
			System.out.println("Please select Menu");
			System.out.println("[1] Add Employee");
			System.out.println("[2] Save Sales");
			System.out.println("[3] Display");
			System.out.println();
			System.out.println("select Menu : ");
			ch = in.nextInt();
			if(ch == 1) {
				addSalay();
			}
			if(ch == 2) { 
				insertSales();
				}
			if(ch == 3) { 
				Displays(sa, sales);
				}
			System.out.println("Do you want to select menu [Y/N]");
			ye = in.next().charAt(0);
		}while(ye == 'y') ;
		System.out.println("ByeBye!!");
		}
	public static void addSalay() {
		String id, name;
		char idns;
		double salary;
		do {
			System.out.println("Please enter id: ");
			id = in.next();
			System.out.println("Please enter name: ");
			name = in.next();
			System.out.println("Please enter salary: ");
			salary = in.nextDouble();
			
			em.add(new Employee(name,id));
			sa.add(new Salary(salary));
			
			System.out.println("Do you want to add employee [Y/N]");
			idns = in.next().charAt(0);
		}while(idns == 'y') ;
	}

	public static void insertSales() {
		String id;
		char insa;
		double sale;
		do {
			for (int i = 0; i < sa.size(); i++) {
				System.out.println("Please enter id: ");
				id = in.next();
				if(em.get(i).getID().equals(id)) {
					System.out.println("Please enter sale: ");
					sale = in.nextDouble();
					sales.add(new Sales(sale));
				}
			}
			System.out.println("Do you want to save salary [Y/N]");
			insa = in.next().charAt(0);
			}while(insa == 'y');
				
		}
	public static void Displays( ArrayList<Salary>sa, ArrayList<Sales>sales) {
		for (int i = 0; i < sa.size(); i++) {
			double com = sa.get(i).calCommission(sales.get(i).getSale(), sa.get(i).getAmount());
			System.out.println(" Employee Name = "+em.get(i).getName()+" ,Commission = "+com);
		}
		
	}
}


	
	



