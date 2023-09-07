import java.util.*;
public class ReverseArray{
    public static void printReverseArray(int arr[]){
        int temp;
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
        for(int j=0;j<n;j++){
            System.out.print(arr[j] + " ");
        }
        
    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetrr the sizw of arr:");
        int n=sc.nextInt();
        int[] arr=new int[n];
         for(int j=0;j<n;j++){
            arr[j]=sc.nextInt();
        }
        System.out.println("The reverse arr:");
        printReverseArray(arr);

    }
}