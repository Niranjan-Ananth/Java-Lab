import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of employees");
		n = s.nextInt();
		ArrayList<Account> listOfAccounts = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the details of each employee");
			int accno = s.nextInt();
			String name = s.next();
			int phoneNumber = s.nextInt();
			float balance = s.nextFloat();
			Account a = new Account(accno, name, phoneNumber, balance);
			listOfAccounts.add(a);
		}
		System.out.println("List of account details");
		for (Account a : listOfAccounts) {
			a.display();
		}

		while (true) {
			System.out.println("Accounts with balance less than 10000 are : ");
			for (Account a : listOfAccounts) {
				if (a.balanceAmount < 10000) {
					a.display();
				}
			}
			Account e = null;
			System.out.println("Enter the account number to operate on an account");
			int acc = s.nextInt();
			for(Account a : listOfAccounts){
				if(a.accNo == acc){
					e = a;
				}
			}
			System.out.println("1.Deposit\n2.Withdraw\n3.Exit");
			int choice = s.nextInt();
			int amt;
			switch (choice) {
			case 1:
				System.out.println("Enter the amount to be deposited");
				amt = s.nextInt();
				e.deposit(amt);
				break;
			case 2:
				System.out.println("Enter the amount to be deposited");
				amt = s.nextInt();
				e.withdraw(amt);
				break;
			case 3:
				s.close();
				System.exit(0);
			}
		}
	}

}
