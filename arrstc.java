import java.util.*;
public class arrstc {
    public static void main(String args[])
    {
        
        int profit=0;
        int price[]={11,10,6,4,9,7};
        int buy= price[0];
        for(int i=1;i<price.length;i++){
            if(price[i]>buy){
                profit=Math.max(price[i]-buy,profit);
            }
            else{
                buy= price[i];
            }
        }
        System.out.println(profit);
    }
}
