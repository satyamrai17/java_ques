import java.util.*;
public class Searching{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);//object
        System.out.println("enter the size of array");
        int size=sc.nextInt();// taking input
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the searching element");
        int target=sc.nextInt();
        for(int i=0;i<size;i++){
            if(arr[i]==target){
                System.out.println("The index is:" + i);
            }
           
        }
        
         
    }
}