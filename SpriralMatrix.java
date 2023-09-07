import java.util.*;
class SpriralMatrix{
    public static void spriralMatrix(int matrix[][]){
        int sr=0,er=matrix.length-1,sc=0,ec=matrix[0].length-1;
        while(sr<=er && sc<=ec){
            for(int j=sc;j<=ec;j++){
                System.out.print(matrix[sr][j]+" ");
            }
            for(int i=sr+1;i<=er;i++){
                 System.out.print(matrix[i][ec]+" ");
            }
            for(int j=ec-1;j>=sc;j--){
                System.out.print(matrix[er][j]+" ");
            }
             for(int i=er-1;i>=sr+1;i--){
                 System.out.print(matrix[i][sc]+" ");
            }
            sr++;
            er--;
            sc++;
            ec--;
        }
    }
    public static void main(String arg[]){
        int matrix[][]={{1,2,3,11,12},
                        {4,5,6,13,14},
                        {7,8,9,15,16}};
        spriralMatrix(matrix);
    }
}