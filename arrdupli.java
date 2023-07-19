import java.util.*;
public class arrdupli {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 no.s in array");
        int a[]= new int[5];
        for(int i =0;i<a.length;i++){
            a[i]= sc.nextInt();
        }
        System.out.println(duplicate(a));
    }
    public static boolean duplicate(int a[]){
        for(int i=0;i<a.length-1;i++){
            for(int j =i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
