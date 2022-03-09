package classSamples.polymorphism.SearchingAndSorting;

public class DriverClass {

	public static void main (String [] args) {
		
		Contact[] address = new Contact [8];
		
		address[0] = new Contact("John", "Smith", "610-555-7384");
		address[1] = new Contact("Sarah", "Barnes", "215-555-3827");
		address[2] = new Contact("Mark", "Riley", "733-555-2969");
		address[3] = new Contact("Liz", "Bean", "663-555-3984");
		address[4] = new Contact("Larry", "Smith", "464-555-3489");
		address[5] = new Contact("Frank", "Phelps", "322-555-2284");
		address[6] = new Contact("Mario", "Guzman", "804-555-9066");
		address[7] = new Contact("Marsha", "Guzmana", "243-555-2837");
		
		
		Sorting.selectionSort(address);
		
		for (Contact friend : address)
			System.out.println(friend);
	}

}
