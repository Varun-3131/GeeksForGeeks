package Main;

public class MultiplyTwoStrings {
    public String multiplyStrings(String s1,String s2)
    {
        String product = "";
        BigInteger a = new BigInteger(s1);
        BigInteger b = new BigInteger(s2);
        BigInteger mul = a.multiply(b);
        product = product + mul.toString();
        return product;
    }
}
