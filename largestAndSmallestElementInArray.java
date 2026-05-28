import java.util.*;
public class largestAndSmallestElementInArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sm=Integer.MAX_VALUE;
        int lg=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>lg){
                lg=arr[i];
            }else{
                sm=arr[i];
            }
        }
        System.out.println("Largest:"+ lg + "\nSmallest:" + sm);
        sc.close();
    }
}