package assignments6;

	
	public class LinkedStack implements StackADT
	{
	   private Node top; // reference to top of stack
	   // ---------------------------------------------------
	   // Constructor -- initializes top
	   // ---------------------------------------------------
	   public LinkedStack()
	   {
	           this.top=null;
	   }
	   // ---------------------------------------------------
	   // Adds element to top of stack if it's not full, else
	   // does nothing.
	   // ---------------------------------------------------
	   public void push(Object val)
	   {

	       Node temp = new Node(); 
	       temp.setElement(val); 
	       temp.setNext(top);
	       top = temp; 
	   }
	   // ---------------------------------------------------
	   // Removes and returns value at top of stack. If stack
	   // is empty returns null.
	   // ---------------------------------------------------
	   public Object pop()
	   {
	           if (top == null) { 
	           System.out.print("\nStack Underflow"); 
	           return null; 
	       } 
	       Object val = top.getElement();
	       top = top.getNext(); 
	       return val;
	   }
	   // ---------------------------------------------------
	   // Returns true if stack is empty, false otherwise.
	   // ---------------------------------------------------
	   public boolean isEmpty()
	   {
	           return top == null;
	   }
	   // ---------------------------------------------------
	   // Returns true if stack is full, false otherwise.
	   // ---------------------------------------------------
	   public boolean isFull()
	   {
	           return true;  //As stack is implemented using LinkedList, it is not fixed size, so it cannot full always
	   }
	}
	

