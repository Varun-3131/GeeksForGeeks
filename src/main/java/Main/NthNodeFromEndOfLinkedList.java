package Main;

public class NthNodeFromEndOfLinkedList {
    int getNthFromLast(Node head, int n)
    {
        // Your code here
        Node first =head;
        for(int i=0;i<n;i++){
            if(first==null)return -1;
            first=first.next;
        }
        Node second=head;
        while(first!=null){
            second=second.next;
            first=first.next;
        }return second.data;
    }
}
