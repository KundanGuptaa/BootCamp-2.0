import java.util.*;
public class DeleteSmallestFromArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        if(n==0){
            return;
        }
        int minIndex=0;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[minIndex]){
                minIndex=i;
            }
        }
        for(int j=minIndex;j<n-1;j++){
            arr[j]=arr[j+1];
        }
        for(int i=0; i<n-1; i++){
            System.out.print(arr[i]);
            if(i < n-2) {
                System.out.print(" ");
            }
        }
        System.out.println();
        sc.close();
        
    }
}
