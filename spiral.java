import java.util.*;
public class spiral 
{
    public static void spiral(int matrix[][])
    {
        int startrow=0;
        int startcolumn=0;
        int endrow=matrix.length-1;
        int endcolumn= matrix[0].length-1;
        while(startrow<=endrow && startcolumn<=endcolumn)
        {
        //top
            for(int i=startcolumn;i<=endcolumn;i++)
            {
                System.out.println(matrix[startrow][i]);
            }
        //right
            for(int j = startrow+1;j<=endrow;j++)
            {
                System.out.println(matrix[j][endcolumn]);
            }
        //bottom
            for(int k= endcolumn-1;k>=startcolumn;k--)
            {
                if(startrow==endrow)
                {
                    break;
                }
                System.out.println(matrix[endrow][k]);
            }
        //left
            for(int l= endrow-1;l>=startrow;l--)
            {
                if(startcolumn==endcolumn)
                {
                    break;
                }
                System.out.println(matrix[l][startcolumn]);
            }
            startcolumn++;
            startrow++;
            endcolumn--;
            endrow--;
        }
        System.out.println();
    }
    public static void main(String[]args)
    {
    
        int matrix [][]= { {1,2,6,5,6,4},
                    {5,6,645,64,4,4},
                    {5,4,54,4,8,4},
                    {5,5,6,5,61,4}};
        spiral(matrix);
    }
}