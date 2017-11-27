package bankinfo;

import javax.persistence.Entity;

@Entity
public class Savingsaccount extends Bankaccount {
	public Savingsaccount(long accountNumber, String accountHolder, String address, long phoneNumber, String mailId,
			double balance) {
		super(accountNumber, accountHolder, address, phoneNumber, mailId, balance);

	}

	private double maxAmountcanbeTransferred = 100000;
	private int maxNumberofTransaction = 5;
	private double amountTransferred;
	private int numberofTransaction;

	public Savingsaccount(long accountNumber, String accountHolder, String address, long phoneNumber, String mailId,
			double balance, double maxAmountcanbeTransferred, int maxNumberofTransaction, double amountTransferred,
			int numberofTransaction) {
		super(accountNumber, accountHolder, address, phoneNumber, mailId, balance);
		this.maxAmountcanbeTransferred = maxAmountcanbeTransferred;
		this.maxNumberofTransaction = maxNumberofTransaction;
		this.amountTransferred = amountTransferred;
		this.numberofTransaction = numberofTransaction;
	}

	public double getMaxAmountcanbeTransferred() {
		return maxAmountcanbeTransferred;
	}

	public void setMaxAmountcanbeTransferred(double maxAmountcanbeTransferred) {
		this.maxAmountcanbeTransferred = maxAmountcanbeTransferred;
	}

	public int getMaxNumberofTransaction() {
		return maxNumberofTransaction;
	}

	public void setMaxNumberofTransaction(int maxNumberofTransaction) {
		this.maxNumberofTransaction = maxNumberofTransaction;
	}

	public double getAmountTransferred() {
		return amountTransferred;
	}

	public void setAmountTransferred(double amountTransferred) {
		this.amountTransferred = amountTransferred;
	}

	public int getNumberofTransaction() {
		return numberofTransaction;
	}

	public void setNumberofTransaction(int numberofTransaction) {
		this.numberofTransaction = numberofTransaction;
	}
	public boolean withdraw()
	{
		return true;
		
	}
	public boolean deposit()
	{
		return true;
	}
}
