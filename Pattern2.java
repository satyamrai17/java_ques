import java.util.Scanner;
public class Pattern2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of row");
        int r=sc.nextInt();
        System.out.println("Enter the number of column");
        int c=sc.nextInt();
        for(int i=0; i<c;i++){
            for(int j=0; j<r ;j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
//  *  *  *  *  *  * 
//  *  *  *  *  *  * 
//  *  *  *  *  *  * 