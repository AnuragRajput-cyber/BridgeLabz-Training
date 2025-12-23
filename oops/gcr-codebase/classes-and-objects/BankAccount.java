package oops;

public class BankAccount{
	private String holder;
	private String accountNo;
	private double balance;
	BankAccount(String holder,String accountNo,double balance){
		this.holder=holder;
		this.accountNo=accountNo;
		this.balance=balance;
	}
	public void deposit(double amt){
		if(amt>0) balance+=amt;
	}
	public void withdraw(double amt){
		if(amt<=balance&&amt>0) balance-=amt;
	}
	public void displayBalance(){
		System.out.println("Balance: "+balance);
	}
	public static void main(String[] args){
		BankAccount acc=new BankAccount("Lynda","12345",700);
		acc.deposit(200);
		acc.withdraw(100);
		acc.displayBalance();
	}
}

