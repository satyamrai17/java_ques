import java.util.Scanner;
public class Pattern8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of column");
        int c=sc.nextInt();
        for(int i=1;i<=c;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            
            for(int j=1;j<=2*c-2*i;j++){
                System.out.print(" ");
            }
             for(int j=1;j<=i;j++){
                System.out.print("*");
        }
        System.out.println();
        }
 for(int i=c;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            
            for(int j=1;j<=2*c-2*i;j++){
                System.out.print(" ");
            }
             for(int j=1;j<=i;j++){
                System.out.print("*");
        }
        System.out.println();
        }
    }
}
// *        *
// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *