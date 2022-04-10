import java.time.LocalDate;

public class Statement {

	public static void bankStatementPersonal() {
		System.out.println();
		System.out.println();
		System.out.println("	Bank Statement						"+LocalDate.now());
		System.out.println(UserAccount.getName());
		System.out.println(PersonalDetails.getAddress());
		System.out.println(PersonalDetails.getZipCityState());

		System.out.println("Customer Type: "+UserAccount.customerType);
		System.out.println("Account Number: "+UserAccount.getAccountNumber());
		System.out.println();
		System.out.println("Checking Summary:");
		System.out.println("Begining Balance          "+AccountType.getBalanceChecking());
		System.out.println("Deposits		  "+Transactions.getDepCheck());
		System.out.println("Withdrawals		  "+Transactions.getWithCheck());
		double endBal=AccountType.getBalanceChecking()+Transactions.getDepCheck()-Transactions.getWithCheck();
		System.out.println("Ending Balance		  "+endBal);
		System.out.println("");
		System.out.println("Savings Summary:");
		System.out.println("Begining Balance          "+AccountType.getBalanceSavings());
		System.out.println("Deposits                  "+Transactions.getDepSav());
		System.out.println("Interest                  "+AccountType.getSavingsInterest());
		System.out.println("Withdrawals               "+Transactions.getWithSav());
		double endBal2=AccountType.getBalanceSavings()+Transactions.getDepSav()-Transactions.getWithSav();
		System.out.println("Ending Balance            "+endBal2);
	}
	
	public static void personalDetails() {
		System.out.println();
		System.out.println();
		System.out.println("	Personal Details					"+LocalDate.now());
		System.out.println("First name: "+PersonalDetails.getFirstName());
		System.out.println("Last name: "+PersonalDetails.getLastName());
		System.out.println("Date of birth: "+PersonalDetails.getDOB());
		System.out.println("Place of birth: "+PersonalDetails.getpob());
		System.out.println("Address: "+PersonalDetails.getAddress());
		System.out.println("         "+PersonalDetails.getZipCityState());
	

	}
}
