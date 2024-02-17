package Main;

public class ReverseWordInString {
    class Solution
    {
        //Function to reverse words in a given string.
        String reverseWords(String S)
        {

            // code here
            String[] arr = S.split("\\.");
            String result = "";
            for(int i=arr.length-1;i>=0;i--){
                if(i != 0){
                    result = result + arr[i] + ".";
                }else{
                    result = result + arr[i];
                }
            }
            return result;
        }
    }
}
