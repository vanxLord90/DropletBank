
public class UserAccount {
	static String customerName;
	static String customerType;
	static int balance;
	static int accountNumber;
	
	public UserAccount(String cType, int bal, int aNum) {
		customerName=PersonalDetails.getFirstName()+" "+PersonalDetails.getLastName();
		customerType= cType;
		balance=bal;
		if(aNum!=00000000)
		accountNumber=aNum;
	}
	
	public static boolean validCustomerType() {
		boolean isValid=false;
		String[] customerTypes={"Personal"," Buisness", "Charity"};
		for(String a: customerTypes) {
			if(customerType.contains(a)) {
				isValid=true;
			}
		}
		return isValid;
			
	}
	public static String getType() {
		return customerType;
	}
	
	public static int getBal() {
		return balance;
	}
	public static void setBal(int deposit) {
		balance= balance+deposit;

	}
	public static int getAccountNumber() {
		return accountNumber;
	}
	public static int generateAccountNum() {
		int randomNum=(int) (Math.random() * (99999999 - 10000000));
		return randomNum;
	}
	public static void setAccountNum() {
		int temp=0;
		temp=generateAccountNum();
		accountNumber=temp;
	}
	
	public static String getName() {
		return customerName;
	}
	
	public static void setName(boolean legalChangeOccurred, String newName) {
		if(legalChangeOccurred) {
			customerName=newName;
		}
		else {
			System.out.println("Please go to a government office to legally change your name first");
		}
	}
	
}
	
	

