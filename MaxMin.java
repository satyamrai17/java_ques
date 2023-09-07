import java.util.*;
public class MaxMin{
    public static void main(String[] args){
        int[] arr={3,4,1,5,7,9};
        maxmin(arr);
    }
    static void maxmin(int [] arr){
        int length=arr.length;
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<length;i++){
           if(arr[i]>max){
            max=arr[i];

           }if(arr[i]<min){
            min=arr[i];
           }

        }
        System.out.println(max+" "+min);
    }
}