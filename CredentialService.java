
import java.util.*;

class CredentialService extends Employee {

	// accessing the first name and last name in parent class

	CredentialService(String firstName, String lastName) {
		super(firstName, lastName); // Accessing the variables in the parameterised employee Constructor
	}

	// Determining The Department
	String selectDepartment() {

		System.out.println(
				"Please Enter The Deparment From The Following \n 1. Technical \n 2. Admin \n 3. Legal \n 4. Human Resource");
				
		Scanner sb = new Scanner(System.in);
		int department = sb.nextInt();
		sb.close();

		if (department == 1) {
			return "tech";

		} else if (department == 2) {
			
			return "admin";
		} else if (department == 3) {
			return "legal";

		} else if (department == 4) {
			return "hr";
		}
		return " ";

	}

	// generate email address

	void generateEmailAddress(String firstName, String lastName) {

		this.department = selectDepartment();

		email = fName.toLowerCase() + lName.toLowerCase() + "@" + department + companyDomain;
		this.password = getPassword(8);

	}

	// generate random password

	private String getPassword(int length) {
		String passwordvalues = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%&*"; // storing the
																											// values
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordvalues.length());
			password[i] = passwordvalues.charAt(rand);
		}
		return new String(password);
	}

	// showing the credentials

	void showCredentails() {

		System.out.println("Hi " + fName + ", Your generated credentials are \n Email --> " + email + "\n Password --> "
				+ this.password);
	}

}
