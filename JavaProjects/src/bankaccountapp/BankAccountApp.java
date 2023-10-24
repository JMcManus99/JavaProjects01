package bankaccountapp;

import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		String file = "C:\\Users\\JackMcManus\\Desktop\\NewBankAccounts.csv";
		/*
		 * Checking chkacc1 = new Checking("Tom Willson", "29501860", 1500);
		 * 
		 * Savings savacc1 = new Savings("Page Turner", "20952719", 2500);
		 * 
		 * savacc1.showInfo(); System.out.println("******************");
		 * chkacc1.showInfo();
		 */

		// Read a CSV file and create new accounts based on that data

		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for (String[] accountHolder : newAccountHolders) {
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			System.out.println(name + " " + sSN + " " + accountType + " £" + initDeposit);
			if (accountType.equals("Savings")) {
				System.out.println("OPEN A SAVINGS ACCOUNT");
			} else if (accountType.equals("Checking")) {
				System.out.println("OPEN A CHECKING ACCOUNT");
			} else {
				System.out.println("ERROR READING ACOUNT TYPE");
			}
		}

	}

}
