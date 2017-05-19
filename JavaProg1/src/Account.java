
public class Account {
	int accNo;
	String name;
	int phoneNo;
	float balanceAmount;
	Account(int a, String n, int p, float b){
		accNo = a;
		name = n;
		phoneNo = p;
		balanceAmount = b;
	}
	public void deposit(int x){
		balanceAmount += x;
		System.out.println("Current balance is " + balanceAmount);
	}
	public void withdraw(int x){
		if(x > balanceAmount){
			System.out.println("Insufficient funds");
			System.out.println("Current balance is " + balanceAmount);
		}
		else{
			balanceAmount -= x;
			System.out.println("Current balance is " + balanceAmount);
		}
	}
	public void display(){
		System.out.println("Account Number : " + accNo);
		System.out.println("Name : " + name );
		System.out.println("Phone Number : " + phoneNo);
		System.out.println("Balance : " + balanceAmount);
	}
}
