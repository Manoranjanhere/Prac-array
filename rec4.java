import java.util.*;
public class rec4 {
    public static int tiles(int n) /*floor size is 2 */
    {
        if(n==0||n==1)
        {
            return 1;
        }
        /*vertical tiles */
        int fmn1=tiles(n-1);
        int fmn2=tiles(n-2);
        int ftol=fmn1+fmn2;
        return ftol;
        

    }
    public static void main(String args[])
    {
        System.out.println(tiles(15));
    }
   
}
