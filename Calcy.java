import java.util.Scanner;
public class Calcy{
    public static void main(String[] args){
        
    Scanner sc= new Scanner(System.in);
    System.out.println("ENter the NuMbEr1");
    int a =sc.nextInt();
    System.out.println("Enter the number2");
    int b=sc.nextInt();
    System.out.println("ENter the choice 1.add 2.sub 3.mul 4.devide");
     int choice=sc.nextInt();
    switch(choice){
        case 1-> System.out.println(a+b);
        case 2-> System.out.println(a-b);
        case 3-> System.out.println(a*b);
        case 4-> System.out.println(a/b);
        default -> System.out.println("choose a valid number");
    }
    }               
}