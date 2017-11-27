package bankinfo;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Table(name="BANK_DETAILS")
@DiscriminatorColumn(name="Bank_type",discriminatorType=DiscriminatorType.STRING)
public class Bankaccount {
	@Id
	private long accountNumber;
	private String accountHolder;
	private String address;
	private long phoneNumber;
	private String mailId;
	protected double balance;

	public Bankaccount(long accountNumber, String accountHolder, String address, long phoneNumber, String mailId,
			double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.mailId = mailId;
		this.balance = balance;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean withdraw() {
		return true;

	}

	public boolean deposit() {
		
		return true;

	}

}
