import java.util.*;
class DiagonalSum{
    public static void diagonalSum(int matrix[][]){
        int n=matrix.length-1;
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+= matrix[i][i];

        }
        sum= sum*2- matrix[n/2][n/2];
        System.out.print("sum is"+ sum);
    }
    public static void main(String arg[]){
        int matrix[][]={{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        diagonalSum(matrix);
    }
}