package Main;

public class MiddleOfLinkedList {
    int getMiddle(Node head)
    {
        // Your code here.
        if(head == null){
            return 0;
        }

        // i will take two node slowptr and fastptr both  Node take a head.


        Node slowptr = head;
        Node fastptr = head;


        while(fastptr != null && fastptr.next != null){
            slowptr = slowptr.next;
            fastptr = fastptr.next.next;

        }

// return statement given slowptr.data it means print number(data)
        return slowptr.data;


    }
