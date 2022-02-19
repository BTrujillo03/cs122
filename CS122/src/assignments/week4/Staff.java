package assignments.week4;

public class Staff extends Employee {
	
	 String title;
	 
	 public Staff ( String name, String address, String phoneNumber, String emailAddress, String offic, int salary, String titles) {
	 
	 super(name, address, phoneNumber,emailAddress,offic,salary);
	 title = titles;
	 }
	 
	 public String toString() {
		return getClass().getName() + " " + name;
	 }
	

	 
}
