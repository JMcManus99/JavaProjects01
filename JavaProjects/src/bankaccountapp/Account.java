package bankaccountapp;

public abstract class Account implements IBaseRate {
	// List common properties for savings and checking accounts
	String name;
	String sSN;
	double balance;

	static int index = 1000;
	String accountNumber;
	double rate;

	// Constructor to set base properties and initialise the account
	public Account(String name, String sSN, double initDeposit) {
		this.name = name;
		this.sSN = sSN;
		balance = initDeposit;
		System.out.println("NAME: " + name + " SSN: " + sSN + " BALANCE: £" + String.format("%.2f", balance));

		// Set account number
		index++;
		this.accountNumber = setAccountNumber();
		System.out.println("ACCOUNT NUMBER " + this.accountNumber);
	}

	private String setAccountNumber() {
		String lastTwoOfSSN = sSN.substring(sSN.length() - 2, sSN.length());
		int uniqueID = index;
		return lastTwoOfSSN + uniqueID;
	}

	// List common methods
}
