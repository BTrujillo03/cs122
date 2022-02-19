package assignments.week4;

public class Employee extends Person {
	
protected String office;
protected double salary;
protected String dateHired;


public Employee ( String name, String address, String phoneNumber, String emailAddress, String offic, double salar, String date) {
	
	super(name,address,phoneNumber,emailAddress);
	office = offic;
	salary = salar;
	dateHired = date;
}
	
	public String toString() {
		return getClass().getName() + " " + name;
	
	
}

}
