package Main;

public class PartitionALinkedListAroundAGivenValue {
    public static Node partition(Node node, int x) {
        // Your code here
        if(node==null){
            return node;
        }
        Node sHead=new Node(-1);
        Node small=sHead;
        Node eHead=new Node(-1);
        Node equal=eHead;
        Node lHead=new Node(-1);
        Node large=lHead;
        while(node!=null){
            if(node.data<x){
                small.next=node;
                small=small.next;
            }else if(node.data==x){
                equal.next=node;
                equal=equal.next;
            }else{
                large.next=node;
                large=large.next;
            }
            node=node.next;
        }

        if(eHead.next!=null){
            small.next=eHead.next;
            equal.next=lHead.next;
        }else{
            small.next=lHead.next;
        }
        large.next=null;
        return sHead.next;
    }
}
