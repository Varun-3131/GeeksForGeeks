package Main;

public class IsBinaryNumberMultipleOf3 {
    int isDivisible(String s) {
        // code here
        int ones = 0;
        int l = s.length();
        for (int i = 0; i < l; i++) {
            if (s.charAt(i) == '1') {
                ones += i % 2 == 0 ? 1 : -1;
            }
        }
        return ones % 3 == 0 ? 1 : 0;
    }
}
