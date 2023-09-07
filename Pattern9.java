import java.util.Scanner;
public class Pattern9{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the number");
        int c=sc.nextInt();
        for(int i=1;i<=c;i++){
            for(int j=1;j<=c-i;j++){
                System.out.print(" ");
            }
             for(int j=1;j<=c;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//      ******
//     ******
//    ******
//   ******
//  ******
// ******