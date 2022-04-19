package classSamples.polymorphism.Firm;//********************************************************************
//  Hourly.java       Author: Lewis/Loftus
//
//  Represents an employee that gets paid by the hour.
//********************************************************************

public class Hourly extends Employee {
	private int hoursWorked;
	private int extra_vacay_days= 3;
	
	public Hourly(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
		// TODO Auto-generated constructor stub
		hoursWorked = 0;	

	}
	
	public void addHours(int moreHours) {
		hoursWorked += moreHours;
	}

		public double pay() {
			double payment - payRate * hoursWorked;
			
			hoursWorked = 0;
			
			return payment;
		}

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
