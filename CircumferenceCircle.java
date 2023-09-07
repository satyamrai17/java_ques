import java.util.*;
public class CircumferenceCircle{
    public static double printCircumferenceCircle(int r){
        double circumference= Math.PI*2*r;
        return circumference;
    }
    public static double printAreaCircle(int r){
        return Math.PI*r*r;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius:");
        int r=sc.nextInt();
        System.out.println("The circumference is = "+  printCircumferenceCircle(r));
        System.out.println("the arae of cicle is= "+ printAreaCircle(r));
    }
}