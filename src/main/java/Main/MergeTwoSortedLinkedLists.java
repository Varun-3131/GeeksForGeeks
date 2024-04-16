package Main;

public class MergeTwoSortedLinkedLists {
    Node sortedMerge(Node head1, Node head2) {
        Node temp1=head1;
        Node temp2 = head2;
        Node nodeTolead = null;
        Node additive = null;
        Node temp3 = null;
        if(head1==null)
            return head2;
        if(head2==null)
            return head1;
        if(temp1.data>temp2.data){
            nodeTolead = temp2;
            additive =temp1;
        }
        else{
            nodeTolead = temp1;
            additive=temp2;
        }
        Node toReturn = nodeTolead;
        while(additive!=null){
            int value = additive.data;
            Node newNode = new Node(value);
            while(nodeTolead!=null && nodeTolead.data<newNode.data){
                temp3 = nodeTolead;
                nodeTolead=nodeTolead.next;
            }
            if(temp3==null){
                temp3 = nodeTolead;
            }
            nodeTolead = temp3;
            if(nodeTolead!=null&&nodeTolead.next!=null){
                Node toHold = nodeTolead.next;
                nodeTolead.next = newNode;
                nodeTolead = newNode;
                newNode.next = toHold;
            }
            else{
                nodeTolead.next= newNode;
                nodeTolead = newNode;
            }
            additive = additive.next;
        }

        return toReturn;
    }
}
