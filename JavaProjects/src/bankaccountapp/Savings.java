package bankaccountapp;

public class Savings extends Account {
	// List properties to the savings account
	int safertyDepositBoxID;
	int safetyDepositBoxKey;

	// Constructor to initialise settings for the Savings properties
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		System.out.println("NEW SAVINGS ACCOUNT ");

	}
	// List any methods specific to Savings account
}
