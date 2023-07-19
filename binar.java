import java.util.*;
public class binar
{
    public static int binary_search(int n[], int key)
    {
        int start=0,end =n.length-1,mid;
        while(start<=end){
            mid= (start+end)/2;
            if(n[mid]==key)
            {
                return mid;
            }
            else if(n[mid]<key)
            {
                start =mid+1;
            }
            else
            {
                end = mid-1;
            }
            }
        return -1;
            }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[] = new int[5];
        for(int i=0;i<a.length;i++){
        a[i]= sc.nextInt();}
        int key=5;
        System.out.println(binary_search(a,key));
   }
}
