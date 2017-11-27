package bankinfo;

import javax.persistence.Entity;

@Entity
public class Currentaccount extends Bankaccount {

	public Currentaccount(long accountNumber, String accountHolder, String address, long phoneNumber, String mailId,
			double balance) {
		super(accountNumber, accountHolder, address, phoneNumber, mailId, balance);

	}

	private double minAmountcanbeTransferred;
	private int minNumberofTransaction;
	private double AmountTransferred;
	private int NumberofTransaction;

	public Currentaccount(long accountNumber, String accountHolder, String address, long phoneNumber, String mailId,
			double balance, double minAmountcanbeTransferred, int minNumberofTransaction, double amountTransferred,
			int numberofTransaction) {
		super(accountNumber, accountHolder, address, phoneNumber, mailId, balance);
		this.minAmountcanbeTransferred = minAmountcanbeTransferred;
		this.minNumberofTransaction = minNumberofTransaction;
		AmountTransferred = amountTransferred;
		NumberofTransaction = numberofTransaction;
	}

	public double getMinAmountcanbeTransferred() {
		return minAmountcanbeTransferred;
	}

	public void setMinAmountcanbeTransferred(double minAmountcanbeTransferred) {
		this.minAmountcanbeTransferred = minAmountcanbeTransferred;
	}

	public int getMinNumberofTransaction() {
		return minNumberofTransaction;
	}

	public void setMinNumberofTransaction(int minNumberofTransaction) {
		this.minNumberofTransaction = minNumberofTransaction;
	}

	public double getAmountTransferred() {
		return AmountTransferred;
	}

	public void setAmountTransferred(double amountTransferred) {
		AmountTransferred = amountTransferred;
	}

	public int getNumberofTransaction() {
		return NumberofTransaction;
	}

	public void setNumberofTransaction(int numberofTransaction) {
		NumberofTransaction = numberofTransaction;
	}

	public boolean withdraw() {
		return true;
	}

	public boolean deposit() {
		return true;
	}
}
