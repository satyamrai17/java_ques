import java.util.*;
class LastOccurrence{
    public static int lastOccurrence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound = lastOccurrence(arr,key,i+1);
        if(isFound==-1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main(String arg[]){
        int arr[]={2,6,4,5,7,5,1};
        System.out.println(lastOccurrence(arr,5,0));
    }
}