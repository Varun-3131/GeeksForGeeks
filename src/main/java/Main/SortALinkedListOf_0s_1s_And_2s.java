package Main;

public class SortALinkedListOf_0s_1s_And_2s {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        if(head==null || head.next == null) return head;
        Node zhead=null,ztail=null,ohead=null,otail=null,thead=null,ttail=null;
        Node temp = head;
        while(temp!=null){
            if(temp.data==0){
                if(zhead==null) zhead=temp;
                else{
                    ztail.next=temp;
                }
                ztail=temp;
            }
            if(temp.data==1){
                if(ohead==null) ohead=temp;
                else{
                    otail.next=temp;
                }
                otail=temp;
            }
            if(temp.data==2){
                if(thead==null) thead=temp;
                else{
                    ttail.next=temp;
                }
                ttail=temp;
            }
            temp=temp.next;
        }
        if(zhead!=null){
            if(ohead!=null){
                ztail.next=ohead;
            }
            else{
                ztail.next=thead;
            }
        }
        if(ohead!=null){
            if(thead!=null) otail.next=thead;
            else otail.next=null;
        }
        if(thead!=null) ttail.next=null;
        if(zhead!=null) return zhead;
        if(ohead!=null) return ohead;
        return thead;

    }
}
