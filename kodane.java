import java.util.*;
public class kodane {
    public static void kodanes(int n[])
    {
        int ms = Integer.MIN_VALUE;
        int cs =0;
        for (int i = 0;i<n.length ; i++)
        {
            cs+=n[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println(ms);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Array :");
        int[] n = new int[5] ;
        for(int i =0;i< n.length ; i++)
            n[i] = sc.nextInt();
        kodanes(n);

    }
    
}
