package Main;

public class RemoveDuplicateElementFromSortedLL {
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
        // Your code here
        Node curr=head;
        if(curr==null){
            return head;
        }
        while(curr.next!=null){
            if(curr.data==curr.next.data){
                curr.next=curr.next.next;
            }else{
                curr=curr.next;
            }
        }return head;
    }

}
