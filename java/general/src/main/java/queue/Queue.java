package queue;

public class Queue<Type> {
    private Node front, rear;

    //class to define linked node
    private class Node {
        Type data;
        Node next;
    }

    //Zero argument constructor
    public Queue() {
        front = null;
        rear = null;
    }

    public boolean isEmpty() {
        return (front == null);
    }

    //Remove item from the beginning of the list.
    public Type dequeue() throws Exception {

        if (isEmpty())
            throw new Exception();

        Type data = front.data;
        front = front.next;

        return data;
    }

    //Add data to the end of the list.
    public void enqueue(Type data) {
        Node oldRear = rear;
        rear = new Node();
        rear.data = data;
        rear.next = null;
        if (isEmpty()) {
            front = rear;
        } else {
            oldRear.next = rear;
        }
    }

    public Type top() throws Exception {
        if(front == null)
            throw new Exception();

        return front.data;
    }
}