package assignments6;

import java.util.Scanner;
import java.util.Stack;

public class ParenMatch {

	
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	Stack<Integer> st = new Stack<Integer>();
	System.out.println("Parenthesis Matching Test\n");
	System.out.println("Enter expression");
	String expression = sc.next();   
	int lnth = expression.length();
	System.out.println("\nMatches and Mismatches:\n");
	for (int uu = 0; uu < lnth; uu++)
	{   
	char choice = expression.charAt(uu);
	if (choice == '(')
	st.push(uu);
	else if (choice == ')')
	{
	try
	{
	int ps = st.pop() + 1;
	System.out.println("')' at index "+(uu+1)+" matched with ')' at index "+ps);
	}
	catch(Exception e)
	{
	System.out.println("')' at index "+(uu+1)+" is unmatched");
	}
	}   
	}
	while (!st.isEmpty() )
	System.out.println("'(' at index "+(st.pop() +1)+" is unmatched");
	}
	}

