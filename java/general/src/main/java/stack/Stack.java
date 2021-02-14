package stack;

// Create stack.Stack Using Linked list
public class Stack<Type> {

    // A linked list node
    private class Node {

        Type data; // integer data
        Node next; // reference variable Node type
    }

    // create global top reference variable global
    Node top;

    // Constructor
    public Stack()
    {
        this.top = null;
    }

    // Utility function to add an element x in the stack
    public void push(Type x) // insert at the beginning
    {
        // create new node temp and allocate memory
        Node temp = new Node();

        // initialize data into temp data field
        temp.data = x;

        // put top reference into temp link
        temp.next = top;

        // update top reference
        top = temp;
    }

    // Utility function to check if the stack is empty or not
    public boolean isEmpty()
    {
        return (top == null);
    }

    // Utility function to return top element in a stack
    public Type peek() throws Exception {
        // check for stack underflow
        if (top == null)
            throw new Exception();

        return top.data;
    }

    // Utility function to pop top element from the stack
    public Type pop() throws Exception // remove at the beginning
    {
        // check for stack underflow
        if (top == null)
            throw new Exception();

        //store value to be returned before moving top pointer
        Type dataPop = top.data;
        // update the top pointer to point to the next node
        top = top.next;

        return dataPop;
    }

    public void display()
    {
        if (top != null) {
            Node nodeIterator = top;
            while (nodeIterator != null) {
                // print node data
                System.out.println("Node data:" + nodeIterator.data);
                // assign temp link to temp
                nodeIterator = nodeIterator.next;
            }
        }
    }
}