package classSamples.polymorphism.Firm;//********************************************************************
//  Employee.java       Author: Lewis/Loftus
//
//  Represents a general paid employee.
//********************************************************************

public class Employee extends StaffMember {
	protected String socialSecurityNumber;
	protected double payRate;

	// -----------------------------------------------------------------
	// Constructor: Sets up this employee with the specified
	// information.
	// -----------------------------------------------------------------
	public Employee(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
		super(eName, eAddress, ePhone);

		socialSecurityNumber = socSecNumber;
		payRate = rate;
	}

	// -----------------------------------------------------------------
	// Returns information about an employee as a string.
	// -----------------------------------------------------------------
	public String toString() {
		String result = super.toString();
		//it calls the staff "toString" from StaffMember.Java

		result += "\nSocial Security Number: " + socialSecurityNumber;

		return result;
	}

	// -----------------------------------------------------------------
	// Returns the pay rate for this employee.
	// -----------------------------------------------------------------
	public double pay() {
		return payRate;
	}
	
	@Override
	public double getVacationDays() {
		return VACATION_DAYS;
	
	
	}
}
