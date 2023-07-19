import java.util.*;
public class arrtranspose {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int arr[][]= new int[3][2];
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                arr[i][j]= sc.nextInt();
            }
        }

            for(int i=0;i<2;i++){
                for(int j=0;j<3;j++){
            
                System.out.print(arr[j][i]);

    }
    System.out.println();
}
    }
}