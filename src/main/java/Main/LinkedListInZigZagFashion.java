package Main;

public class LinkedListInZigZagFashion {
    public static Node zigZag(Node head){
        //add code here.
        if(head==null || head.next==null){
            return head;
        }

        Node main=head;

        if(main.data>main.next.data){
            int temp1 = main.data;
            main.data = main.next.data;
            main.next.data=temp1;
        }
        if(head.next.next==null){
            return head;
        }

        Node n1 = head.next;
        Node n2 = n1.next;


        int i=0;

        while(n2!=null){
            if(i%2==0){
                int temp = Math.min(n1.data, n2.data);
                n1.data=Math.max(n1.data, n2.data);
                n2.data = temp;

                n1=n2;
                n2=n1.next;
                main=main.next;
            }
            if(i%2==1){
                int temp=Math.max(n1.data, n2.data);
                n1.data=Math.min(n1.data,n2.data);
                n2.data=temp;

                n1=n2;
                n2=n1.next;
                main=main.next;
            }
            i++;
        }
        return head;
    }
}
