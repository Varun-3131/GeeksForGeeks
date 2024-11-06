package Main;

public class BooleanMatrix {
    //Function to modify the matrix such that if a matrix cell matrix[i][j]
    //is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(int mat[][])
    {
        // code here
        int[][] temp = new int[mat.length][mat[0].length];

        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j] == 1){
                    for(int k=0; k<mat[0].length; k++){
                        temp[i][k] = 1;
                    }
                    for(int k=0; k<mat.length; k++){
                        temp[k][j] = 1;
                    }
                }
            }
        }

        for (int i = 0; i < temp.length; i++) {
            mat[i] = Arrays.copyOf(temp[i], temp[i].length);
        }
    }
}
