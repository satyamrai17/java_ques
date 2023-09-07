import java.util.*;
class MaxSubArraySum{
    public static void maxSubArraySum(int arr[]){
        int curSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1] + arr[i];
        }
         for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                curSum= i==0 ? prefix[j] : prefix[j] - prefix[i-1];
                if(maxSum<curSum){
                    maxSum=curSum;
                }
            }
            
        }
        System.out.print("max sum ="+ maxSum);
    }
    public static void main(String arg[]){
        int number[]={1,-2,6,-1,3};
        maxSubArraySum(number);
    
    }
}