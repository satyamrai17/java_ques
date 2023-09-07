import java.util.*;
public class Fuction1cl{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr two numbner");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=addTwoNumber(a,b);
        System.out.println("The sum is="+ sum);
    }
    public static int addTwoNumber(int a,int b){
        int sum=a+b;
        return sum;
    }
}