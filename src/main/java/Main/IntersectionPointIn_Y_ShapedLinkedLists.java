package Main;

public class IntersectionPointIn_Y_ShapedLinkedLists {

    //Function to find intersection point in Y shaped Linked Lists.
    int intersectPoint(Node head1, Node head2)
    {
        HashSet<Node> set = new HashSet<>();
        // Node p = head1;
        // Node q = head2;
        Node p = head1;
        while (p != null) {
            set.add(p);
            p = p.next;
        }

        Node q = head2;
        while (q != null) {
            if (set.contains(q)) {
                return q.data;
            }
            q = q.next;
        }

        return -1;

    }
}
