import java.util.*;
public class Factorial{
    public void factorialNumber(int n){
        if(n>=0){
        int fact=1;
        for(int i=n;i>=1;i--){
            fact=fact*i;
            
        }
        System.out.println("Factorial is="+fact);
        }
        else{
            System.out.println("Invalid Number");
        }
    }

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the number");
        int n=sc.nextInt();
        factorialNumber(n);
    }
}