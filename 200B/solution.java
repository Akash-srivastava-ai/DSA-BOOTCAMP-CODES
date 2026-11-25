import java.util.*;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        float avg = (float)sum/n;
        System.out.printf("%.5f",avg);
        sc.close();
    }
}
