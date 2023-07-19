import java.util.*;
public class allsort {
    //ascending
    public static void bubblesort(int arr[]){
        // bigo n^2
        for(int turn=0;turn<arr.length-1;turn++){
            //j is the swapping loop which decreases by 1 everytime with turn as largest already stored at last so no need to check that
            for(int j=0;j<arr.length-1-turn;j++){
                //Done to store smallest element at last.. means swapping is done continously 
                //till largest element reach the last..
                //swap
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    
                }
            }
        }
    }
    public static void selectionsort(int arr[]){
        //bigo n^2
        for(int turn=0;turn<arr.length;turn++){
            int min = turn;
            //in case of this selection sort the smallest element in the array would be found first..
            for(int i=turn+1;i<arr.length;i++)
            {
                if(arr[min]>arr[i]){
                    min=i;
                }
            }
            //then we will swap and take the smallest element directly to first place;without swapping everytime.
            //then again loop will continue doing same thing of finding smallest and keeping it in 2nd 3rd and so on.
            int temp=arr[turn];
            arr[turn]=arr[min];
            arr[min]=temp;
        }
}
    public static void insertionsort(int arr[]){
        //bigo n^2
        for(int i =1;i<arr.length;i++){
            int curr=arr[i];///current position
            int prev =i-1;///previous position
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;

        }
    }
    public static void countingsort(int arr[]){
        //nlogn and sometimes n;//descending
        int largest= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=count.length-1;i>=0;i--){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }

    }
    public static void main(String args[])
    {
        int arr[]={3,6,2,1,8,7};
        // time bigo nlogn for inbuilt sort.
        Arrays.sort(arr);//for ascending
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);}

        Integer arr1[]={3,6,2,1,7,8};///we have taken integer because collection.reverseOrder only works on
        /// object/primitive object and int is not primitive object
        Arrays.sort(arr1,Collections.reverseOrder());//for descending
            for(int i=0;i<arr1.length;i++){
                System.out.println(arr1[i]);
         }

        bubblesort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        selectionsort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        insertionsort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        countingsort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}