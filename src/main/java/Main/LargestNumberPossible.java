package Main;

public class LargestNumberPossible {
    static String findLargest(int N, int S) {
        // code here
        if (N * 9 < S)
            return "-1";
        if (N > 1 && S == 0)
            return "-1";
        if (S == 0)
            return "0";

        String res = "";
        int maxDigit = 9;
        while (maxDigit > 0 && res.length() < N) {
            int maxFreq = S / maxDigit;
            S -= maxDigit * maxFreq;
            res += Integer.toString(maxDigit).repeat(maxFreq);
            maxDigit--;
        }

        if (res.length() < N)
            res += "0".repeat(N - res.length());

        return res;
    }
}
