package assignment4;
import java.util.Scanner;

public class BaseConversion {
	  
	public static void main (String[] args)
    {
        int base10Num;
        int base;

        Scanner scan = new Scanner (System.in);

        System.out.println ();
        System.out.println ("The base conversion");
        System.out.print ("Enter an integer: ");
        base10Num = scan.nextInt();
        System.out.print ("Enter the base: ");
        base = scan.nextInt();

        // Call convert and print the answer
        String ans = convert(base10Num,base);
        System.out.println("Base "+base + " number : " + ans);

    }





public static String convert (int num, int b) {
	
    int quotient = num/b;  // the quotient when num is divided by base b
    int remainder = num%b; // the remainder when num is divided by base b
    if(quotient==0){
        // return remainder if quotient is 0
        return  "" + remainder;
    }
    return convert(quotient,b) + remainder;
}
}