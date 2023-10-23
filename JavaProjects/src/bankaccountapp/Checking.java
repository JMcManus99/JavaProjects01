package bankaccountapp;

public class Checking extends Account {
	// List properties specific to a checking account
	int debitCardNumber;
	int debitCardPin;

	// Constructor to initialise checking account properties
	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		System.out.println("New Checking account");
	}

	// List any methods specific to the checking account
}
