import java.util.Scanner;
public class TakeInput{
    public static void main( String[] args){
        System.out.println("Taking input from user");
       Scanner sc = new Scanner(System.in);
    //      System.out.println("Enter the 1st number");
    //    int a=sc.nextInt();
    //    System.out.println("Enter 2ns number");
    //    int b=sc.nextInt();
    //    int sum=a+b;

    //    System.out.println("the sum is");
    //    System.out.println(sum);
    //    boolean b1= sc.hasNextInt();
    //    System.out.println(b1);
        String str = sc.nextLine();
        System.out.println(str);
    }
}