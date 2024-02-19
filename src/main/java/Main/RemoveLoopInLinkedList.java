package Main;

public class RemoveLoopInLinkedList {
        //Function to remove a loop in the linked list.
        public static void removeLoop(Node head){
            // code here
            boolean b=false;
            Node slow=head,fast=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    b=true;
                    break;
                }
            }
            if(b==true){
                if(slow!=head){
                    slow=head;
                    Node prev=fast;
                    while(slow!=fast){
                        slow=slow.next;
                        prev=fast;
                        fast=fast.next;
                    }
                    prev.next=null;
                }else{
                    Node prev=null;
                    slow=slow.next;
                    while(slow!=head){
                        prev=slow;
                        slow=slow.next;
                    }
                    prev.next=null;
                }
            }
        }
}
