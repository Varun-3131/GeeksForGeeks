package Main;

public class RemoveDuplicates {
    String removeDups(String S) {

        HashSet<Character>set =new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<S.length() ; i++){
            if(set.add(S.charAt(i))){
                sb.append(S.charAt(i));
            }
        }

        return sb.toString();
    }
}
