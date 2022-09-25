
import java.util.*;

public class Employee {
	// Defining the needed variables
	protected String fName;
	protected String lName;

	protected String department;
	protected String companyDomain = ".greatlearning.com";
	protected String email;
	protected String password;
	protected int passwordlength;

	// Default Constructor
	Employee() {
		super();
	}

	// Parameterised Constructor

	Employee(String firstName, String lastName) {

		this.fName = firstName;
		this.lName = lastName;

	}

	public static void main(String[] args) {

		// Taking First Name And Last Name Input From User
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your First Name : ");
		String FirstName = sc.nextLine();
		System.out.print("Enter Your Last Name : ");
		String LastName = sc.nextLine();
		

		// Instantiating the class objects
		Employee one = new Employee(FirstName, LastName);
		CredentialService two = new CredentialService(FirstName, LastName);

		// Output
		System.out.println("Welcome To Great Learning");

		two.generateEmailAddress(FirstName, LastName);
		two.showCredentails();

	}

}
