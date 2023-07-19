import java.util.*;
public class arrfind {
    public static void arrfind(int nums[], int target)
    {
        for(int i=0;i<nums.length;i++)
        {
            if(target==nums[i]){
                System.out.println("index no. of target element is: "+i);
                System.exit(0);
            }

        }
        System.out.println("-1");
    }
    public static void main(String args[])
    {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 no.");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        arrfind(a,6);
    }
}
