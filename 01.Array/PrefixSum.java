import java.util.*;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] prefix = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        prefix[0]=arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        int start=sc.nextInt();
        int end=sc.nextInt();
        System.out.println(prefix[end-1]-prefix[start-1]);
        sc.close();

    }
}
