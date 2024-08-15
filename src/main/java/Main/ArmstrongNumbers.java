package Main;

public class ArmstrongNumbers {
    static String armstrongNumber(int n) {
        int temp = n;
        int res = 0;

        while (n != 0)
        {

            int digit = n % 10;

            res += Math.pow(digit, 3);

            n /= 10;
        }
        if (res == temp)
        {
            return "true";
        }
        else
        {
            return "false";
        }
    }
}
