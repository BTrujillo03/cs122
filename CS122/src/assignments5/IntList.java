package assignments5;

public class IntList {

	private IntNode front;  //first node in list
    
    // Constructor. Initially list is empty.
    public IntList(){
            front = null;
    }
    //-----------------------------------------
    //Adds given integer to front of list.
    //-----------------------------------------
    public void addToFront(int val){
            front = new IntNode(val,front);
    }
    //-----------------------------------------
    //Adds given integer to end of list.
    //-----------------------------------------
    public void addToEnd(int val){
            IntNode newnode = new IntNode(val,null);
            //if list is empty, this will be the only node in it
            if (front == null)
                    front = newnode;
            else {
                    //make temp point to last thing in list
                    IntNode temp = front;
                    while (temp.next != null)
                            temp = temp.next;
                    //link new node into list
                    temp.next = newnode;
            }
    }
    //-----------------------------------------
    //Removes the first node from the list.
    //If the list is empty, does nothing.
    //-----------------------------------------
    public void removeFirst(){
            if (front != null)
                    front = front.next;
    }
    
    
    //-----------------------------------------
    //Removes the last node from the list.
    //If the list is empty, does nothing.
    //-----------------------------------------
    
    public void removeLast() {
            
            if(front == null)
                    return;
            // To check if there is only one node in the list
            else if(front.next == null)
                    front = null;
            else {
                    IntNode curr = front;
                    IntNode prev = null;
                    while(curr.next != null) {
                            prev = curr;
                            curr = curr.next;
                    }
                    
                    // To delete the last node from the list 
                    prev.next = null;
                    curr = null;
            }
    }
    
    // To replace occurrence of all oldValue with the given newValue
    
    public void replace(int oldVal, int newVal) {
            
            if(front == null)
                    return;
            else {
                    IntNode p =front;
                    while(p != null) {
                            if(p.val == oldVal)
                                    p.val = newVal;
                            p = p.next;
                    }
            }
    }
    // To get total number of nodes present in list
    public int length() {
            
            int len = 0;
            IntNode temp = front;
            
            if(front == null)
                    return 0;
            else {
                    while(temp != null) {
                            len++;
                            temp = temp.next;
                    }
            }
            return len;
    }
    
    // To print string representation of this list using toString()
    @Override
    public String toString() {
            
            String str = "";
            IntNode temp = front;
            while (temp != null){
                    str += temp.val + " ";
                    temp = temp.next;
            }
            return str;
    }
    
    //Prints the list elements from first to last. //------------------------------------------------
    
    public void print(){
            System.out.println("--------------------");
            System.out.print("List elements: ");
            IntNode temp = front;
            while (temp != null){
                    System.out.print(temp.val + " ");
                    temp = temp.next;
            }
            System.out.println("\n-----------------------\n");
    }
    
    
    // An inner class that represents a node in the integer list.
    // The public variables are accessed by the IntList class.

    private class IntNode{
            public int val; //value stored in node
            public IntNode next; //link to next node in list //------------------------------------------------------------------
            //Constructor; sets up the node given a value and IntNode reference //------------------------------------------------------------------
            public IntNode(int val, IntNode next){
                    this.val = val;
                    this.next = next;
            }
    }       
}

}
