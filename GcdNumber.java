import java.util.*;
public class GcdNumber{
    public static int printGcdNumber(int a,int b){
        int gcd=1;
        for(int i=1;i<=a && i<=b;i++){
            if(a % i==0 && b%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr two number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("GCD = "+ printGcdNumber(a,b));
    }
}