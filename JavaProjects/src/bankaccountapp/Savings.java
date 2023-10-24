package bankaccountapp;

public class Savings extends Account {
	// List properties to the savings account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;

	// Constructor to initialise settings for the Savings properties
	public Savings(String name, String sSN, double initDeposit) {
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;

		setSafetyDepositBox();
	}

	@Override
	public void setRate() {
		rate = getBaseRate() - .25;
	}

	// List any methods specific to Savings account

	private void setSafetyDepositBox() {
		safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}

	public void showInfo() {

		super.showInfo();
		System.out.println("YOUR SAVINGS ACCOUNT FEATURES" + "\nSafety Deposit box ID: " + safetyDepositBoxID
				+ "\nSafety Deposit Box key: " + safetyDepositBoxKey);
	}
}
