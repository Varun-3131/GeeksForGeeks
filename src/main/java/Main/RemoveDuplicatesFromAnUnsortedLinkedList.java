package Main;

public class RemoveDuplicatesFromAnUnsortedLinkedList {
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head){
        Node temp = head;
        Node prev = new Node(0);
        if (head==null){
            return null;
        }
        HashSet<Integer> ans = new HashSet<>();
        while(temp!=null){
            if(ans.contains(temp.data)){
                prev.next = temp.next;
            }
            else{
                ans.add(temp.data);
                prev = temp;
            }
            temp = temp.next;
        }
        return head;
    }
}
