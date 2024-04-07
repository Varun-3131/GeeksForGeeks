package Main;

public class GivenALinkedListOf0s1sAnd2sSortIt {
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        Node ptr=head;
        Node p=null,h1=null;
        int c1=0,c2=0;
        while(ptr!=null){
            if(ptr.data==0){
                Node n = new Node(ptr.data);
                if(p==null) {
                    p=n;
                    h1=p;
                }else{
                    p.next=n;
                    p=n;
                }

            }
            ptr=ptr.next;
        }
        ptr=head;
        while(ptr!=null){
            if(ptr.data==1){
                Node n = new Node(ptr.data);
                if(p==null) {
                    p=n;
                    h1=p;
                }else{
                    p.next=n;
                    p=n;
                }

            }
            ptr=ptr.next;
        }
        ptr=head;
        while(ptr!=null){
            if(ptr.data==2){
                Node n = new Node(ptr.data);
                if(p==null) {
                    p=n;
                    h1=p;
                }else{
                    p.next=n;
                    p=n;
                }

            }
            ptr=ptr.next;
        }
        return h1;
    }
}
