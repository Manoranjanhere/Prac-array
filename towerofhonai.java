import java.util.*;
public class towerofhonai{
    public static void honai(int n,String src,String helper, String dest){
        if(n==1){
            System.out.println(" from "+src+" to "+dest);
            return;
        }
        honai(n-1, src,dest,helper);
        System.out.println(" from "+src+" to "+dest);
        honai(n-1,helper,src,dest);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of disks");
        int a = sc.nextInt();
        
    honai(a,"A","B","C");
    }
}