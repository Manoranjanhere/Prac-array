import java.util.*;
public class buysellstock
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[]= new int[5];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        int buy = Integer.MAX_VALUE;
        int profit,maxprofit=0;
        for(int i=0;i<a.length;i++)
        {
            if(buy<a[i])
            {
                profit=a[i]-buy;    
                maxprofit=Math.max(maxprofit,profit);          
            }
            else
            {
                buy=a[i];
            }
        }
        System.out.println("Maximum profit="+maxprofit);
    }
}