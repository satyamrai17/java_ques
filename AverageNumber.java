import java.util.*;
public class AverageNumber{
    public static float printAverageNumber(int a,int b,int c){
        float average= (a+b+c)/3 ;
        return average;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the three number:");

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        
        System.out.println(printAverageNumber(a,b,c));
    }
}