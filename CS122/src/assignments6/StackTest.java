package assignments6;

import java.util.Stack;

public class StackTest {
	
	public static void main(String[] args) {
		// Declare and instantiate a stack
		        Stack stack = new Stack();
		// Push some stuff on to the stack
		        for (int i = 0; i < 10; i++)
		            stack.push(i);
		        stack.push(5);
		        printStack(stack);

		        stack = reverseStack(stack);

		        printStack(stack);

		        stack = removeElement(stack, 5);

		        printStack(stack);
		    }

		    public static Stack reverseStack(Stack st) {
		        Stack reversed = new Stack();
		        while (!st.empty())
		            reversed.push(st.pop());
		        return reversed;
		    }

		    public static void printStack(Stack st) {
		        System.out.print("Stack's elements: ");
		        Stack temp = new Stack();
		        while (!st.empty()) {
		            Object obj = st.pop();
		            temp.push(obj);
		            System.out.print(obj + " ");
		        }
		        System.out.println();


		        
		        while (!temp.empty())
		            st.push(temp.pop());
		    }

		    public static Stack removeElement(Stack<Integer> st, int val) {
		        Stack<Integer> updated = new Stack<>();
		        while (!st.empty()) {
		            if (st.peek() != val)
		                updated.push(st.peek());
		            st.pop();
		        }
		        while (!updated.empty())
		            st.push(updated.pop());
		        return st;
		    }
		}

	
	
	
	
	

	/* public static void main(String[] args)
	{
	   StackADT stack = new LinkedStack ();
	   //push some stuff on the stack
	   for (int i=0; i<10; i++)
	   stack.push(i*2);
	   //pop and print
	   //should print 18 16 14 12 10 8 6 4 2 0
	   while (!stack.isEmpty())
	   System.out.print(stack.pop() + " ");
	   System.out.println();
	   //push a few more things
	   for (int i=1; i<=6; i++)
	   stack.push(i);
	   //should print 6 5 4 3 2 1
	   while (!stack.isEmpty())
	   System.out.print(stack.pop() + " ");
	   System.out.println();
	   }
*/
	
}
