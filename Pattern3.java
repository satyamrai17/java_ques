import java.util.Scanner;
public class Pattern3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the number of row");
        int r=sc.nextInt();
        System.out.println("Enetr the number of column");
        int c=sc.nextInt();
        for(int i=1;i<=c;i++){
            for(int j=1;j<=r;j++){
                if(i==1 || j==1 || i==c || j==r){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println("");
        }
    }
}

// ********
// *      *
// *      *
// *      *
// ********