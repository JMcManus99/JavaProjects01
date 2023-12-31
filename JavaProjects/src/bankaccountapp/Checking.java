package bankaccountapp;

public class Checking extends Account {
	// List properties specific to a checking account
	private int debitCardNumber;
	private int debitCardPin;

	// Constructor to initialise checking account properties
	public Checking(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}

	@Override
	public void setRate() {
		rate = getBaseRate() * .15;
	}

	// List any methods specific to the checking account
	private void setDebitCard() {
		debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
		debitCardPin = (int) (Math.random() * Math.pow(10, 4));
	}

	public void showInfo() {
		super.showInfo();
		System.out.println("YOUR CHECKING ACCOUNT FEATURES" + "\nDebit Card Numnber: " + debitCardNumber
				+ "\nDebit Card Pin: " + debitCardPin);
	}
}
