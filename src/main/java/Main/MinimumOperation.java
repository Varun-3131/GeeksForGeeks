package Main;

public class MinimumOperation {
    public int minOperation(int n) {
        // code here
        if (n == 0 || n == 1) {
            return n;
        }
        if (n == 2 || n == 3) {
            return n;
        }

        int a = n, count = 0;

        while (a >= 3) {
            if (a % 2 != 0) {
                count += 1;
            }

            a = a / 2;
            count += 1;
        }

        return count + a;
    }
}
