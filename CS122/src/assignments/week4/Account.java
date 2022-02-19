package assignments.week4;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	
	public Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
	}
	
	public Account (int id, double balance) {
		setID(id);
		setBalance(balance);
		
	}
	public int getID() {
		return id;
		
	}
	public void setID(int i) {
		id = i;
	}
	public double getBalance() {
	return balance;
	}
	
	public void setBalance(double b) {
		balance = b;
	}
	
	public void setAnnualInterestRate(double r) {
		annualInterestRate = r;
	}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	public void withdraw (double amount) {
		balance -= amount;
	}
	public void deposit ( double amount) {
		balance += amount;
	}

}
