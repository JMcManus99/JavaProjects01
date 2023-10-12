package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private int defaultPasswordLength = 10;
	private String department;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String companySuffix = "bigbusiness.com";
	
	//Constructor to receive the first and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		//Call a method asking for the department - return that department
		this.department = setDepartment();
		
		//Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		
		//combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
	}
	
	//Ask for the department
	private String setDepartment() {
		System.out.print("New Worker: " + firstName + "Department Codes\n1 for Sales \n2 for Development \n3 for Accounting \n0 for None\nEnter department code ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice ==1) {return "sales"; }
		else if(depChoice ==2) {return "dev"; }
		else if(depChoice ==3) {return "acct"; }
		else {return ""; }
	}
	
	//Generate a random Password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUWXYZ0123456789!@#£%";
		char[] password = new char[length];
		for(int i = 0; i <length; i ++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	//Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	//Set the alt email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	//Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() {return mailboxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password; }
	
	public String showInfo() {
		return "Display Name: " + firstName + " " + lastName + 
				"\nCompany Email: " + email +
				"\nMailbox Capacity: " + mailboxCapacity + "mb";
	}
}
