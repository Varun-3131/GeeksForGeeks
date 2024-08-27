package Main;

public class ImplementStackUsingLinkedList {
    // class StackNode {
    //     int data;
    //     StackNode next;
    //     StackNode(int a) {
    //         data = a;
    //         next = null;
    //     }
    // }
    StackNode top;

    // Function to push an integer into the stack.
    void push(int a)
    {
        StackNode newnode = new StackNode(a);
        newnode.next = top;
        top=newnode;
    }
    int pop()
    {
        if(top == null)
            return -1;
        StackNode temp = top;
        top = top.next;
        return temp.data;
    }
}
