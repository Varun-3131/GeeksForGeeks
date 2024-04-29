package Main;

public class ModifyLinkedList_1 {
    public static Node modifyTheList(Node head)
    {
        ArrayList<Integer> l = new ArrayList<>();
        Node p = head;
        while(p!=null){
            l.add(p.data);
            p=p.next;
        }
        p=head;
        for(int i=0;i<l.size()/2;i++){
            int key=l.get(i);
            l.set(i,(l.get(l.size()-1-i))-l.get(i));
            l.set((l.size()-1-i),key);
        }
        for(int i=0;i<l.size();i++){
            p.data=l.get(i);
            p=p.next;
        }
        return head;
    }
}
