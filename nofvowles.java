import java.util.*;
public class nofvowles {
    public static void main(String args[]){
        int count=0;
        String str=new Scanner(System.in).next();
        for(int i =0;i<str.length();i++){
            char ch =str.charAt(i);
            if(ch=='a'||ch=='e'){
                count++;
            }
        }
        System.out.println(count);
    }
}
