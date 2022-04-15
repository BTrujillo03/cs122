package assignment4;
import java.util.Scanner;

public class CreatingException {
	
	public static void main(String[] args) throws StringTooLongException{
	       Scanner input =new Scanner(System.in);
	       String input_string="";
	       
	       System.out.println("Enter the string (type Done to end) ");
	      
	       while(input.hasNext())
	       {
	           
	           String temp=input.next();
	           
	           if(!temp.equalsIgnoreCase("done"))
	               input_string=input_string+temp;
	           
	           else
	           {
	               try
	               {
	                   if(input_string.length()>20)
	                       throw new StringTooLongException("You typed too many characters !");
	               }
	              
	               catch(StringTooLongException e)
	               {
	                   System.out.println(e);
	                   System.exit(0);
	               }
	              
	           
	       }

	   }

	}
	

}
