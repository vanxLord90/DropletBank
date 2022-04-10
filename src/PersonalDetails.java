
public class PersonalDetails {
	static String firstName;
	static String lastName;
	static String address;
	static String cityStateZip;
	static String dateOfbirth;
	static String placeOfBirth;
	static int changes;
	
	
	public static String getFirstName() {
		return firstName;
	}
	public static String getLastName() {
		return lastName;
	}
	
	public static String getAddress() {
		return address;
	}
	public static void setZipCityState(String s) {
		cityStateZip=s.replace("_", " ");
	}
	public static String getZipCityState() {
		return cityStateZip; 
	}
	public static String getDOB() {
		return dateOfbirth;
	}
	public static String getpob() {
		return placeOfBirth;
	}
	public static void setFirstName(String f) {
		firstName=f;
		changes++;
	}
	public static void setLastName(String l) {
		lastName=l;
		changes++;
	}
	
	public static void setAddress(String a) {
		address=a.replace("_", " ");
		changes++;
	}
	public static void setDOB(String dob) {
		dateOfbirth=dob;
		changes++;

	}
	public static void setpob(String pob) {
		placeOfBirth=pob;
		changes++;
	}
	public static int getChanges() {
		return changes;
	}

}
