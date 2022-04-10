
public class Transactions {
	 static double withdrawSavings;
	 static double withdrawChecking;

	 static double depositSavings;
	 static double depositChecking;
	 
	public static void depositChecking(double cash) {
		depositChecking+=cash;
	}
	
	public static void depositSaving(double cash) {
		depositSavings+=cash;

	}
	
	public static void withdrawSavings(double cash) {
//		AccountType.withdraw(cash, false, true);
		withdrawSavings+=cash;
	}
	
	public static void withdrawChecking(double cash) {
//		AccountType.withdraw(cash, true, false);
		withdrawChecking+=cash;
	}
	public static double getWithSav() {
		return withdrawSavings;
	}
	public static double getWithCheck() {
	
		return withdrawChecking;

	}
	public static double getDepSav() {
	return depositSavings;

	}
	public static double getDepCheck() {
	
		return depositChecking;

	}
	
	
}
