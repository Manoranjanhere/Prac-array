import java.util.*;

public class subarrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n[] = new int[5];
        int start = 0, end = n.length - 1;
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
        for (int j = 0; j <= end; j++) {
            start = j;
            for (int k = j; k <= end; k++) {
            
                for (int l = start; l <= k; l++) {
                    System.out.print(n[l] + " ");
                }
                System.out.println();
            }
        }
    }
}
