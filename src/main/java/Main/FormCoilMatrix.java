package Main;

public class FormCoilMatrix {
    static int[][] formCoils(int n) {
        int m=8*n*n;
        int[] coil1=new int[8*n*n];
        int[] coil2=new int[8*n*n];
        int flag=1;
        int step=2;
        coil1[0]=8*n*n+2*n;
        int curr=coil1[0];
        int index=1;

        while(index<m){

            for(int i=0; i<step; i++){
                coil1[index++]=(curr-4*n*flag);
                curr=(curr-4*n*flag);
                if(index>=m){
                    break;
                }
            }

            if(index>=m){
                break;
            }

            for(int i=0; i<step; i++){
                coil1[index++]=(curr+flag);
                curr=(curr+flag);
                if(index>=m){
                    break;
                }
            }

            if(index>=m){
                break;
            }

            flag=flag*(-1);
            step+=2;
        }

        for(int i=0; i<m; i++){
            coil2[i]=16*n*n+1-coil1[i];
        }
        int[][] ans=new int[][]{coil1,coil2};
        return ans;
    }
}
