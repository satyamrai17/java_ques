import java.util.*;
public class Fuction2cl{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the two number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("The product is="+productTwoNumber(a,b));
    }
    public static int productTwoNumber(int a,int b){
        return a * b ;
    }
}