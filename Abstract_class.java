import java.util.*;
public static void funct(int x,int y){
    System.out.println(x+y);
}
public class Abstract_class{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int  x = sc.nextInt();
    int  y = sc.nextInt();
    funct(x,y);
}
}