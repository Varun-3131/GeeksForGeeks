package Main;

public class DeleteNnodesAfterMNodesAfALinkedList {
    static void linkdelete(Node head, int M, int N)
    {
        // your code here
        Node t1=head,t2=null;
        int h=M,t=N;
        while(t1!=null){
            M--;
            t2=t1;
            t1=t1.next;
            while(M==0&&N-->0&&t1!=null){
                t1=t1.next;
            }
            if(t1==null){
                t2.next=null;
                return;
            }
            if(N<=0){
                t2.next=t1;
                M=h;
                N=t;
            }
        }
        //return head;
    }
}
