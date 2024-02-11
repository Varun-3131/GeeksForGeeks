package Main;
public class Parenthesischecker {
    class Solution
    {
        //Function to check if brackets are balanced or not.
        static boolean ispar(String str)
        {
            // add your code here
            Stack<Character> s = new Stack<>();
            int n = str.length();

            for(int i=0; i<n; i++){
                char ch = str.charAt(i);

                if(ch == '(' || ch == '{' || ch == '['){
                    s.push(ch);
                }

                else{
                    if(s.isEmpty()){
                        return false;
                    }
                    if( (s.peek() == '(' && ch == ')')
                            || (s.peek() == '{' && ch == '}')
                            || (s.peek() == '[' && ch == ']') ){
                        s.pop();
                    }
                    else{
                        return false;
                    }
                }
            }

            if(s.isEmpty()) {
                return true;
            }

            return false;
        }
    }
}
