import java.util.*;
public class arrtrap {
    public static void trap(int arr[])
    {
    int sum=0;
    int rain=0;
    int left[]= new int[6];
    int right[]=new int[6];
    left[0]=arr[0];
    right[5]=arr[5];
    for(int i =0;i<arr.length;i++)
    {
        //for left boundry
        for(int j=1;j<6;j++){
            left[j]=Math.max(arr[j],left[j-1]);
        }
        //for right boundry
        for(int j=arr.length-2;j>=0;j--){
            right[j]= Math.max(arr[j],right[j+1]);
        }
        for(int j=0;j<6;j++){

        rain=Math.min(left[i],right[i]);
            sum+=(rain-arr[i]);
        }
    }
    System.out.println(sum);
}
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    int arr[]=new int[6];
    System.out.println("Enter bars");
    for(int i =0;i<arr.length;i++){
    arr[i]=sc.nextInt();
    }
    trap(arr);
    }
}
