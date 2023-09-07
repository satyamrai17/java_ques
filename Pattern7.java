import java.util.Scanner;
public class Pattern7{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enete the row");
        // int r=sc.nextInt();
       System.out.println("Enter the column");
       int c=sc.nextInt();
       int p=1;
        for(int i=0;i<c;i++){
            for(int j=0;j<=i;j++){
                
                System.out.print(p+" ");
                p++;
            }
            System.out.println();
        }
    }
}
// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15 
// 16 17 18 19 20 21 