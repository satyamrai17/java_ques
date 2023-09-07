import java.util.*;
public class GreaterNumber{
    public static int printGreaterNumber(int a,int b){
        if(a<b){
            return b;
        }
        else{
            return a;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Greatest Number is = " + printGreaterNumber(a,b));
    }
}