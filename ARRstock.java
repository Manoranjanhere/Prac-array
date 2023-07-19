import java.util.*;
public class ARRstock {
    public static void main(String args[])
    {
        int arr[] = {11,10,6,4,9,7};
        int tempp = Integer.MAX_VALUE;
        int neww = Integer.MIN_VALUE;
        int a=0;
        for(int i = 1;i<arr.length;i++){
            if(arr[i]<tempp){
                tempp=arr[i];
                a=i;
            }
        }
        for(int j= a; j<arr.length;j++){
            if(arr[j]>neww)
            {
                neww=arr[j];
            }
        }
        System.out.println(neww-tempp);
        System.out.println(neww);
    }
}
