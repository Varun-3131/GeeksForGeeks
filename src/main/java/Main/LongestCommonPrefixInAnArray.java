package Main;

public class LongestCommonPrefixInAnArray {
    public int compare (String a ,String b){
        int i =0;
        int cnt =0;

        while(i<a.length()&&i<b.length()){

            if(a.charAt(i)==b.charAt(i)){
                cnt++;
            }
            else{
                return cnt;
            }
            i++;
        }
        return cnt;
    }

    String longestCommonPrefix(String arr[], int n){
        // code here
        String a = "";
        int count=Integer.MAX_VALUE;

        if(n==1){
            return arr[0];
        }

        for(int i =0;i<n-1;i++){
            int  ans = compare(arr[0],arr[i+1]);
            if(ans == 0){
                return "-1";
            }
            if(ans<count){
                count=ans;
            }

        }
        for(int i = 0;i<count;i++){
            a+=arr[0].charAt(i);
        }

        return a;

    }
}
