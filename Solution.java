package bankinfo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		double amt;
		int nooftrans;
		int i=0;
		while(i<2)
		{
	    System.out.println("Enter your account number: ");
		long accountNumber=Long.valueOf(bf.readLine());
		System.out.println("Enter the account holder name: ");
		String accountHolder=bf.readLine();
		System.out.println("Enter your address: ");
		String address=bf.readLine();
		System.out.println("Enter your phone number:  ");
		long phoneNumber=Long.valueOf(bf.readLine());
		System.out.println("Enter your mail id:  ");
		String mailId=bf.readLine();
		System.out.println("Enter your balance ");
		double balance=Double.valueOf(bf.readLine());
		
		Bankaccount ba=new Bankaccount(accountNumber, accountHolder, address, phoneNumber, mailId, balance);
		
	    session.save(ba);
		session.beginTransaction();
		session.getTransaction().commit();
		i++;}

		session.close();
		sf.close();
		System.out.println("1.Savings account\n 2.Current account");
		int n=Integer.valueOf(bf.readLine());
		switch(n)
		{
		case 1:
			amt=Double.valueOf(bf.readLine());
			nooftrans=Integer.valueOf(bf.readLine());
		}
	}
	
	
	

	

}
