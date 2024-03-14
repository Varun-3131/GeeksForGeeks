package Main;

public class MergeSortforLinkedList {
    static Node mergeSort(Node head)
    {
        // add your code here
        ArrayList<Integer> arr = new ArrayList<>();

        Node temp = head;

        while(temp != null)
        {
            arr.add(temp.data);
            temp = temp.next;
        }
        Collections.sort(arr);

        Node dummy = new Node(0);
        Node curr = dummy;

        for(int i = 0; i < arr.size(); i++)
        {
            Node node = new Node(arr.get(i));
            curr.next = node;
            curr = node;
        }
        return dummy.next;
    }
}
