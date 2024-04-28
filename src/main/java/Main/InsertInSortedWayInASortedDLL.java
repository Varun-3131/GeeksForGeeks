package Main;

public class InsertInSortedWayInASortedDLL {
    public static Node sortedInsert(Node head, int x)
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Node current = head;
        while(current != null)
        {
            arr.add(current.data);
            current = current.next;
        }
        arr.add(x);
        Collections.sort(arr);

        Node newhead = null,tail=null;
        for(int i:arr)
        {
            Node newnode = new Node(i);
            if(newhead == null)
            {
                newhead = newnode;
                tail = newnode;
            }
            else{
                tail.next = newnode;
                newnode.prev = tail;
                tail = newnode;
            }
        }
        return newhead;

    }
}
