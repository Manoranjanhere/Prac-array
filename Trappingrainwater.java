// import java.util.*;
// public class Trappingrainwater 
// {
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number of terms");
//         int n =sc.nextInt();
//         int wl,tw=0;
//         int a[]=new int[n];
//         for(int i=0;i<a.length;i++)
//         {
//             a[i]=sc.nextInt();
//         }
//         //maximun left boundry
//         int leftmax[]=new int[n];
//         leftmax[0]=a[0];
//         for(int j=1;j<a.length;j++){
//             leftmax[j]=Math.max(a[j],leftmax[j-1]);
//         }
//         int rightmax[]=new int[n];
//         rightmax[n-1]=a[n-1];
//         for(int k=n-2;k>0;k--){
//             rightmax[k]=Math.max(a[k],rightmax[k+1]);
//         }
//         for(int i=0;i<a.length;i++){
//             wl=Math.min(leftmax[i], rightmax[i]);
//             tw+=wl-a[i];
//         }
//         System.out.println(tw);
//     }
// }
import java.util.*;

public class Trappingrainwater 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms");
        int n =sc.nextInt();
        int wl,tw=0;
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        //maximun left boundry
        int leftmax[]=new int[n];
        leftmax[0]=a[0];
        for(int j=1;j<a.length;j++){
            leftmax[j]=Math.max(a[j],leftmax[j-1]);
        }
        int rightmax[]=new int[n];
        rightmax[n-1]=a[n-1];
        for(int k=n-2;k>=0;k--){
            rightmax[k]=Math.max(a[k],rightmax[k+1]);
        }
        for(int i=0;i<a.length;i++){
            wl=Math.min(leftmax[i], rightmax[i]);
            tw+=wl-a[i];
        }
        System.out.println(tw);
    }
}
