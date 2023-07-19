import java.util.*;
public class Reverse {
    public static void reverse(int n[]){
        int first=0,last=n.length-1,temp;
        while(first<last){
            temp=n[first];
            n[first]=n[last];
            n[last] = temp;
            first++;
            last--;
        }for(int i =0;i<n.length;i++){
            System.out.println(n[i]);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n[]=new int[5];
        for(int i =0;i<n.length;i++){
            n[i]= sc.nextInt();
        }
        reverse(n);
    }
}
