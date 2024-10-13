package Main;

public class PlusOne {
    static ArrayList<Integer> increment(ArrayList<Integer> arr , int N) {
        // code here
        ArrayList<Integer> al = new ArrayList<Integer>(arr);
        for(int i= N-1;i>=0;i--){
            if(arr.get(i) <9){
                al.set(i,al.get(i)+1);
                return al;
            }
            al.set(i,0);
        }
        al.add(0,1);
        return al;

    }
}
