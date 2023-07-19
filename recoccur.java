import java.util.*;
public class recoccur{
public static void recc(int arr[], int key,int i){
    if(i==arr.length){
        return;
    }
    if(arr[i]==key){
        System.out.print(i+" ");
    }
    recc(arr,key,i+1);
}
public static void main(String args[]){
    int arr[]={1,2,3,4,5,5,6};
    
    recc(arr,5,0);
}
}