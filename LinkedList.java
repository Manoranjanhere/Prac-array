// import java.util.*;

// public class llpall {
//     public static class Node{
//         int data;
//         Node next;
//         public Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }
//     public static Node head;
//     public static Node tail;

//     public Node findnode(Node head){
//         Node slow = head;
//         Node fast =head;
//         while(fast !=null && fast.next!=null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;
//     }
//     public void addfirst(int data){
//         Node newNode=new Node(data);
//         if(head==null){
//             head = tail = newNode;
//             return;
//         }
//         newNode.next=head;
//         head = newNode;
//     }
//     public void addlast(int data){
//         Node newNode = new Node(data);
//         if(head==null){
//             head = tail = newNode;
//             return;
//         }
//         tail.next=newNode;
//         tail=newNode;
//     }
//     public void print(){       
//         if(head==null){
//             System.out.println("ll is empty");
//         }
//         Node temp = head;
//         while(temp!=null){
//             System.out.print(temp.data);
//             temp=temp.next;
//         }
        
//     }
// }
//     public static void main(String args[]){
//         llpall ll=new llpall();
//         ll.addLast(1);
//         ll.addLast(2);
//         ll.addFirst(3);
//         ll.addFirst(4); 
//         ll.print();

//     } 
import java.util.*;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static Node findnode(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        Node mid = findnode(head);
        System.out.println(mid);
        ll.print();
    }
}
