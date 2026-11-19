import java.util.*;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while(tests-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            long sum = 0;
            for(int i = 0;i<arr.length;i++){
                arr[i] = sc.nextInt();
                sum+=arr[i];
            }
            Arrays.sort(arr);

            long[] prefix = new long[n+1];
            for(int i = 0 ; i<n;i++){
                prefix[i+1] = prefix[i] + arr[i];
            }
            long max = Long.MIN_VALUE;
            for(int i = 0;i<=k;i++){
                long ss = prefix[2*i];
                long ls = sum - prefix[n-(k-i)];
                long remaining = sum - ss - ls;
                max = Math.max(remaining,max); 
            }
            System.out.println(max);
        }
        sc.close();
    }
}
