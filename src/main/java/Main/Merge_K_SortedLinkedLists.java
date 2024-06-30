package Main;

public class Merge_K_SortedLinkedLists {
    Node merge(Node n1, Node n2)
    {
        if(n1==null)
            return n2;
        if(n2==null)
            return n1;
        Node head1 = new Node(-1);
        Node head=head1;
        while(n1!=null && n2!=null)
        {
            if(n1.data>n2.data)
            {
                head.next=n2;
                n2=n2.next;
            }
            else
            {
                head.next=n1;
                n1=n1.next;
            }
            head=head.next;
        }
        if(n1!=null)
        {
            head.next=n1;
        }
        if(n2!=null)
        {
            head.next=n2;
        }
        return head1.next;
    }

    Node mergeKList(Node[]arr,int K)
    {
        //Add your code here
        Node newhead=arr[0];
        for(int x=1;x<K ; x++)
        {
            newhead=merge(newhead,arr[x]);
        }
        return newhead;
    }
}
