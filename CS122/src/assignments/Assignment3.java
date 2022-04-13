package assignments;
import java.util.Scanner;

public class Assignment3 {

	//This is Question 3 of Polymorphic Sorting 
	public static class Strings {
	

	public static void main(String[] args) {
		
	
		String[] stringList;
		int size;
	
	Scanner scan = new Scanner(System.in);
	
	System.out.print ("How many  strings do you want to sort? ");
	size = scan.nextInt();
	scan.nextLine();
	stringList = new String[size];
	
	System.out.println ("Input" + size + "The Strings you want to sort");
	
	for (int i = 0; i < size; i++) {
		
	 stringList[i] = scan.nextLine();
	}
	
	Sorting.selectionSort(stringList);
	
	System.out.println ("Your Strings have been sorted in order");
	
	for (int i = 0; i < size; i++) {
	
		System.out.print(stringList[i] + " ");
	System.out.println (); 
}
}
	}
}


	