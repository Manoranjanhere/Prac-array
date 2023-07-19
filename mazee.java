// `import java.util.*;` is importing all the classes from the `java.util` package, which includes
// various utility classes such as `Scanner`, `ArrayList`, `LinkedList`, etc.
import java.util.*;
public class mazee{
    public static boolean issafe(int maze[][],int x,int y){
        return(x>=0&&x<=maze.length&&y>=0&&y<=maze.length&&maze[x][y]==1);
    }
    public static void printsolution(int sol[][]){
        for(int i =0;i<sol.length;i++){
            for(int j =0;j<=sol.length;j++){
                System.out.println(" "+sol[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean solvemaze(int maze[][]){
        int n = maze.length;
        int sol [][]= new int[n][n];
        if(solvemazeuntil(maze,0,0,sol)==false){
            System.out.println("Solution doesnot exist");
            return false;
        }
        printsolution(sol);
        return true;

    }
    public static boolean solvemazeuntil(int maze[][],int x, int y, int sol[][]){
        if(x==maze.length-1 && y==maze.length-1 && maze[x][y]==1){
            sol[x][y]=1;
            return true;
        }
        if(issafe(maze,x,y)==true){
            if(sol[x][y]==1){
                return false;
            }
            sol[x][y]=1;
            if(solvemazeuntil(maze,x+1,y,sol)){
                return true;
            }
                if(solvemazeuntil(maze,x,y+1,sol)){
                    return true;
            }
            sol[x][y]=0;
            return false;
        }
        return false;
    }

    public static void main(String[] args){
        int maze[][]={{1,0,0,0},{1,1,0,1},{0,1,0,0},{1,1,1,1}};
        solvemaze(maze);
    }
}