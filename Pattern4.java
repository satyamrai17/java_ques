import java.util.Scanner;
public class pattern4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enete the row");
        // int r=sc.nextInt();
       System.out.println("Enter the column");
       int c=sc.nextInt();
        for(int i=0;i<c;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// *
// **
// ***
// ****
// *****
// ******
// *******