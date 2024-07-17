package Main;

public class GetMinimumElementFromStack {
    class GfG
    {
        int minEle;
        Stack<Integer> s;

        // Constructor
        GfG()
        {
            s=new Stack<>();
        }

        /*returns min element from stack*/
        int getMin()
        {
            if(s.isEmpty()) return -1;
            return minEle;
        }

        /*returns poped element from stack*/
        int pop()
        {
            if(s.isEmpty()) return -1;
            int top=s.pop();
            if(top<minEle){
                int val=minEle;
                minEle=2*minEle-top;
                return val;
            }
            return top;
        }

        /*push element x into the stack*/
        void push(int x)
        {
            if(s.isEmpty()){
                s.push(x);
                minEle=x;
            }
            else if(x<=minEle){
                s.push(2*x-minEle);
                minEle=x;
            }
            else
                s.push(x);
        }
    }
}
