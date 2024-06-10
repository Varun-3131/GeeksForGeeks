package Main;

public class ArithmeticNumber {
    static int inSequence(int A, int B, int C){
        // code here

        if(A==B && C==0){
            return 1;
        }
        int n = (B-A);
        if(C!=0 && n%C==0 && n/C>=0){
            return 1;
        }
        return 0;
    }
}
