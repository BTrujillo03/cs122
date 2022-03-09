package classSamples.polymorphism.Firm;//********************************************************************
//  Hourly.java       Author: Lewis/Loftus
//
//  Represents an employee that gets paid by the hour.
//********************************************************************

public class Hourly extends Employee {
	private int hoursWorked;
	private int extra_vacay_days= 3;

	// -----------------------------------------------------------------
	// Constructor: Sets up this hourly employee using the specified
	// information.
	// -----------------------------------------------------------------
	public Hourly(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
		super(eName, eAddress, ePhone, socSecNumber, rate);

		hoursWorked = 0;
	}

	// -----------------------------------------------------------------
	// Adds the specified number of hours to this employee's
	// accumulated hours.
	// -----------------------------------------------------------------
	public void addHours(int moreHours) {
		hoursWorked += moreHours;
	}

	// -----------------------------------------------------------------
	// Computes and returns the pay for this hourly employee.
	// -----------------------------------------------------------------
	public double pay() {
		double payment = payRate * hoursWorked;

		hoursWorked = 0;

		return payment;
	}

	// -----------------------------------------------------------------
	// Returns information about this hourly employee as a string.
	// -----------------------------------------------------------------
	public String toString() {
		String result = super.toString();
		// toString calls from Staff

		result += "\nCurrent hours: " + hoursWorked;

		return result;
	}
	
	public double getVacationDays() {
		
		return super.getVacationDays() + extra_vacay_days;
	}
}
