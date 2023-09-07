import java.util.*;
public class ArraySum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enetr the size of array");
        int n=sc.nextInt();
         int[] num=new int[n];
        for(int i=0;i<n;i++){
             num[i]=sc.nextInt();
        }
        // for(int i=0;i<n;i++){
        // System.out.println(num[i]);
        // }
        System.out.println("Enetr the target");
        int target=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){

            int c=num[i]+num[j];
            if(target==c){
                System.out.println("sum of inedex " +i+" and "+ j + " is equal to target "+target );
            }
            }
        }
    }
}