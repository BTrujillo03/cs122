package assignment4;
import java.util.Scanner;

public class Driver {

		

    private static void testDocument() throws InvalidDocumentCodeException
    {
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the two characters for document designation");
        String s=scanner.next();
        char c=s.charAt(0);
        
         
        if ((c=='U'||c=='C'||c=='P') && (s.length()==2)){
            System.out.println("Document Designation is correct");
        }
        else {
            throw new InvalidDocumentCodeException(" Invalid");
        }
    }
 

    public static void main(String[] args) {

        
        while (true){
            try {
                
                testDocument();
            }
           
            catch (InvalidDocumentCodeException exception) {
                
                System.out.println(exception.getMessage());
                System.exit(0);
            }
        }
    }
    }