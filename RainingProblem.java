import java.util.*;
class RainingProblem{
    public static int rainingProblem(int arr[]){
        int n=arr.length;
        int leftMax[]=new int[n];
        leftMax[0]=arr[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(arr[i],leftMax[i-1]);

        }
        int rightMax[]=new int[n];
        rightMax[n-1]=arr[n-1];
         for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(arr[i],rightMax[i+1]);

        }
        int trappedWater=0;
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(leftMax[i],rightMax[i]);
            trappedWater+=waterlevel-arr[i];
        }
        return trappedWater;
    }
    public static void main(String arg[]){
        int height[]={4,2,0,6,3,2,5};
        System.out.println(rainingProblem(height));
    }
}