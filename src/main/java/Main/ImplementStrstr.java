package Main;

public class ImplementStrstr {
    //Function to locate the occurrence of the string x in the string s.
    int strstr(String s, String x)
    {
        // Your code here
        int index = s.indexOf(x);  // Find the first occurrence of x in s

        if(index != -1) {
            return index; // If x is found, return the index
        }

        return -1; // If x is not found, return -1
    }
}
