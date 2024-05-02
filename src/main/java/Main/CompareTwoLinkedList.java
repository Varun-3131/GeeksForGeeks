package Main;

public class CompareTwoLinkedList {
    int compare(Node node1, Node node2)
    {
        //Your code here
        String s1= "";
        while(node1 != null)
        {
            s1 += node1.data;
            node1 = node1.next;

        }
        String s2= "";
        while(node2 != null)
        {
            s2 += node2.data;
            node2 = node2.next;

        }
        int a = s1.compareTo(s2);

        if(a >=1) return 1;
        else if(a <= -1) return -1;

        return 0;
    }
}
