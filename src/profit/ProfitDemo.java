package profit;

import java.util.Scanner;
import java.util.ArrayList;

public class ProfitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int ch;
		char id, nam, ye=0;
		double sal, sale;
		ArrayList<Employee>em = new ArrayList<Employee>();
		ArrayList<Salary>sa = new ArrayList<Salary>();
		do {
		System.out.println("Please select Menu");
		System.out.println("[1] Add Employee");
		System.out.println("[2] Save Sales");
		System.out.println("[3] Display");
		ch = in.nextInt();
		
		if(ch == 1) {
	
			do {
				System.out.println("Please enter id: ");
				id = in.next().charAt(0);
				System.out.println("Please enter name: ");
				nam = in.next().charAt(0);
				System.out.println("Please enter salary: ");
				sal = in.nextDouble();
				
				em.add(new Employee("id","nam"));
				sa.add(new Salary(sal));
				System.out.println("Do you want to add employee [Y/N]");
				ye = in.next().charAt(0);
			}while(ye == 'y') ;
		}
		
		if(ch == 2) {
			do {
				System.out.println("Please enter id: ");
				id = in.next().charAt(0);
				System.out.println("Please enter sale: ");
				sale = in.nextDouble();
				for (int i = 0; i < sa.size(); i++) {
					sa.get(i).equals(id);
				}
				
				System.out.println("Do you want to save salary [Y/N]");
				ye = in.next().charAt(0);
			}while(ye == 'y');
		}
		
		if(ch == 3) {
			Displays(sa);
		}
		
		System.out.println("Do you want to select menu [Y/N]");
		ye = in.next().charAt(0);
		}while(ye == 'y') ;
			System.out.println("ByeBye!!");
	}
	
	public static void Displays(ArrayList<Salary> sa) {
		for (int i = 0; i < sa.size(); i++) {
			System.out.println(sa.get(i).toString());
		}
	}

}
