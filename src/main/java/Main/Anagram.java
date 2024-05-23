package Main;

public class Anagram {
    public static boolean isAnagram(String a,String b)
    {
        boolean ans=false;
        char []ch1=a.toCharArray();
        char []ch2=b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1, ch2))
        {
            ans =true;
        }
        return ans;

    }
}
