package assignments.week4;

public class Faculty extends Employee {

	protected String officeHours;
	protected String rank;
	
	public Faculty( String name, String address, String phoneNumber, String emailAddress, String offic, String ranks, int salary, String officeH) {
		
		super(name, address, phoneNumber,emailAddress,offic,salary, officeH);
		
		officeHours = officeH;
		rank = ranks;
	}
	
	public String toString() {
		return getClass().getName() + " " + name;
	}
	
}
