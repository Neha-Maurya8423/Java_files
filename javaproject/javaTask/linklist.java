package javaproject.javaTask;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class linklist {
    private Node head;

    public static void main(String[] args) {
        linklist list = new linklist();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.addFirst(0);
        System.out.println("List size: " + list.size());
        list.display();
    }
 
    // Add a node at the beginning of the list
    public void addFirst(int data) {
        Node cur=new Node(data);
        cur.next=head;
        head=cur;
    }

    // Add a node at the end of the list
    public void add(int data) {
    Node newNode=new Node(data);
    if(head==null)
    {
        head=newNode;
    }
    else{
        Node current=head;
        while(current.next!=null){
        current=current.next;
        }
        current.next=newNode;
    }
     
    }

    // Display the list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Get the size of the list
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
  
}
