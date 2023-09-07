import java.util.Scanner;
public class Pattern6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the column");
        int c=sc.nextInt();
        for(int i=0;i<c;i++){
            for(int j=0;j<=c-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
//         *
//        **
//       ***
//      ****
//     *****
//    ******
//   *******