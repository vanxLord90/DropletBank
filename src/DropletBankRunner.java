
import java.util.Scanner;

public class DropletBankRunner {
	

	public static void main(String[]args) {
		Scanner in= new Scanner(System.in);
		System.out.println("	Welcome to Droplet Bank");
		System.out.println("	      enter anything");
		String in1=in.next();
		System.out.println("Four options here:1) Set up personal details, 2) Set up bank account, 3) Log transactions. ");
		System.out.println("Please enter the number of the choice you would like. Enter 0 to exit");
		int choices=in.nextInt();
		while(choices!=0) {
		if(choices==1) {
		System.out.println("Please enter your first and last name, zipcode, date of birth and place of birth.");
		System.out.print("First name: ");
		String firstName=in.next();
		System.out.print("Last name: ");
		PersonalDetails.setFirstName(firstName);
		String lastName=in.next();
		PersonalDetails.setLastName(lastName);
		System.out.println("Street address-house number, street, (use _ for space): ");
		String address= in.next();
		PersonalDetails.setAddress(address);

 		System.out.println("city, state, zip code( use _ for spaces): ");
		String zipCityStatee= in.next();
		PersonalDetails.setZipCityState(zipCityStatee);
		System.out.println("Date of Birth: ");
		String dateOfbirth=in.next();
		PersonalDetails.setDOB(dateOfbirth);
		System.out.println("Place of Birth: ");
		String placeOfBirth=in.next();
		PersonalDetails.setpob(placeOfBirth);
		Statement.personalDetails();

		}
		if(choices==2) {
		System.out.println();
		   System.out.println("		Bank Account Set Up.");
		   System.out.print("Customer type (Business, Personal, Charity): ");
		   String cType= in.next();
		   System.out.print("Balance: ");
		   int bal= in.nextInt();;
		   System.out.print("Account number: ");
		   int aNum= in.nextInt();
		}
		if(choices==3) {
		double amount=0;
		System.out.println("Enter the number of transactions made this year");
		int numTrans=in.nextInt();
		int i=0;
		String s= "";
		String s2="";
		while(numTrans>i) {
			System.out.println("Enter the transaction: Withdraw or Deposit");
			s= in.next();
			if(s.equals("Deposit")) {
				System.out.println("Checking or Savings?");
				s2= in.next();
				if(s2.equals("Checking")) {
					System.out.print("Enter the amount: ");
					amount=in.nextFloat();
					System.out.println("Now we will update the Checking account with this deposit.");
					Transactions.depositChecking(amount);
				}
				else {
					System.out.print("Enter the amount: ");
					amount=in.nextFloat();
					System.out.println("Now we will update the Savings account with this deposit.");
					Transactions.depositSaving(amount);
				}	
			}
			else if(s.equals("Withdraw")) {
				System.out.println("Checking or Savings?");
				s2= in.next();
				if(s2.equals("Checking")) {
					System.out.print("Enter the amount: ");
					amount=in.nextFloat();
					System.out.println("Now we will update the Checking account with this withdrawal");
					Transactions.withdrawChecking(amount);
				}
				else {
					System.out.print("Enter the amount: ");
					amount=in.nextFloat();
					System.out.println("Now we will update the Savings account with this withdrawal");
					Transactions.withdrawSavings(amount);
				}	
			}	
			i++;
		}
		Statement.bankStatementPersonal();

		}
		System.out.println("");
		System.out.println("");
		System.out.println("Four options here:1) Set up personal details, 2) Set up bank account, 3) Log transactions. ");
		System.out.println("Please enter the number of the choice you would like. Enter 0 to exit");
		choices=in.nextInt();
		}
		System.out.println("	Thanks for visiting Droplet Bank!");		
		
		in.close();
		
		
		
	}
}
