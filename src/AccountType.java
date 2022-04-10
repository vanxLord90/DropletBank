
public class AccountType {
	  static String accountType;
	  static boolean savings;
	 static boolean checking;
	  static double savingsRate;
	  static double balanceChecking;
	  static double balanceSavings;
	  static double	savingsInterest;
	
	public AccountType(String accountT, boolean save,boolean check, double savRate) {
		accountType=accountT;
		savings=save;
		savingsRate=savRate;
		checking=check;
	}
	
	public static void setBalance(double cash, boolean savings, boolean checking) {
		if(savings) {
			balanceSavings+=cash;
		}
		else if(checking) {
			balanceChecking+=cash;
		}
		else if(checking && savings){
			balanceSavings+=cash;
			balanceChecking+=cash;
		}
	}
	
	public static double getBalanceChecking() {
		return balanceChecking;
	}
	
	public static double getBalanceSavings() {
		return balanceSavings;
	}
	public static double getSavingsInterest() {
		return savingsInterest;
	}
	public static void updateSavings() {
		
		double old= balanceSavings;
		balanceSavings=Math.pow(balanceSavings,savingsRate);
		savingsInterest=old-balanceSavings;
		
	}
	public static void withdraw(double cash, boolean checking, boolean savings) {
		if(savings) {
			balanceSavings-=cash;
		}
		else if(checking) {
			balanceChecking-=cash;
		}
		else if(checking && savings){
			balanceSavings-=cash;
			balanceChecking-=cash;
		}
	}
	

}
