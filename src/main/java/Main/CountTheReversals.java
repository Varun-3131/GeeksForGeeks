package Main;

public class CountTheReversals {

    int countRev (String s)
    {
        // your code here
        int storeanswer =0;
        int length =s.length();
        Stack<Character>stacki = new Stack<>();
        for(int i =0;i<length;i++){
            if(s.charAt(i)=='{'){
                stacki.push(s.charAt(i));
            }
            if(s.charAt(i)=='}'){
                if (!stacki.isEmpty() && stacki.peek() == '{') {
                    stacki.pop();
                }else{
                    storeanswer=storeanswer+1;
                    stacki.push('{');
                }
            }
        }
        int n = stacki.size();
        if(n%2 !=0){
            return -1;
        } else{
            storeanswer +=n/2;
        }

        return storeanswer;
    }
}
