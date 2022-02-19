package assignments.week4;

public class Student extends Person {
	
	final int freshman = 0;
	final int sophmore = 1;
	final int junior = 2;
	final int senior = 3;
	String status = "senior";
	
	public Student ( String name, String address, String phoneNumber, String emailAddress, int Status) {
		
		super(name, address, phoneNumber, emailAddress);
		
		if (Status == 0) {
			status = "freshman";
			
		}
		
		if ( Status == 1) {
			status = "sophmore";
		}
		
		if ( Status == 2) {
			status = "junior";
		}
		
		if ( Status == 3) {
			status = "senior";
		}
		else {
			Status = "Student";
		}
	
	
		public String toString() {
			return getClass().getName() + " " + name;
		
	}

}
