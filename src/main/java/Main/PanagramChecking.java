package Main;

public class PanagramChecking {
    public static boolean checkPangram  (String s) {
        // your code here
        if(s.length()<26){
            return false;
        }
        String str = s.toLowerCase();
        HashSet<Character> set = new HashSet <>();
        for(int i = 0;i<s.length();i++){
            char ch = str.charAt(i);
            if(ch<=123 && ch >= 97){
                set.add(ch);
            }

        }

        if(set.size()==26){
            return true;
        }
        else{
            return false;
        }
    }

}
