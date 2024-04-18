package Main;

public class _CollectionSet_7_LinkedList {

    public void deleteNode(Node node) {
        //Add your code here
        if(node.next==null){
            return;
        }
        node.data=node.next.data;
        node.next=node.next.next;
    }
}
