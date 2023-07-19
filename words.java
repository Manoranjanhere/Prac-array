import java.util.*;
public class words {
    static String digits[]={"zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    public static void word(int number){
        if(number==0){
            return;
        }
        int lastdigit=number%10;
        word(number/10);
        System.out.print(digits[lastdigit]+" ");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to converd to word");
        int a = sc.nextInt();
        word(a);
    }
}
