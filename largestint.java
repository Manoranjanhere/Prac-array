import java.util.*;
public class largestint {
    public static void search(int matrix[][]){
        int ms = Integer.MIN_VALUE;
        int a=0,b=0;
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]>ms){
                    ms = matrix[i][j];
                    a = i;
                    b =j; 
                }
                }
                
            }
            System.out.println(ms+"at("+a+","+b+")");
        }
    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int n = matrix.length; 
        int m = matrix[0].length;
        for(int i =0;i<n;i++){
            for (int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix);
            }
        }
