package Main;

public class CheckIfLinkedListIsPalindrome {
    public Node find(Node head){
        Node fast=head;
        Node slow=head;


        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }


    boolean isPalindrome(Node head)
    {

        Node mid=find(head);

        if(mid==head){
            if(head.next==null){
                return true;
            }
            if(mid.next.data==mid.data){
                return true;
            }

            return false;
        }

        Node next=null;
        Node curr=mid;
        Node prev=null;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node ref=head;

        while(ref!=null && prev!=null){
            if(ref.data!=prev.data){
                return false;
            }

            ref=ref.next;
            prev=prev.next;
        }

        return true;

    }
}
