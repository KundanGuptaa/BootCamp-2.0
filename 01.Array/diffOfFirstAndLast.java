import java.util.*;
public class diffOfFirstAndLast {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Diffrence of first and last element of an array:"+(arr[0]-arr[n-1]));
    }
}
