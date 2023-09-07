import java.util.*;
class KadanAlgo{
    public static void kadanAlgo(int arr[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        
        for(int i=0;i<arr.length;i++){
            cs=cs +arr[i];
            if(cs<0){
                cs=0;
                
            }
           
            ms=Math.max(cs,ms);
        }
        System.out.println("max subarray sum is ="+ ms);
    }
    public static void main(String arg[]){
        int num[]={-2,-1,4,-1,-4,5,1};
        kadanAlgo(num);
    }
}