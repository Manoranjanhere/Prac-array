import java.util.*;
public class funcsum {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        sum(a);
    }
    public static void sum(int n)
    {
        int l;
        int sum=0;
        while(n>0)
        {
            l=n%10;
            sum+=l;
            n/=10;
        }
        System.out.println(sum);
    }

}
