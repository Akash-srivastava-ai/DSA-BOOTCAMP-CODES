import java.util.*;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int min = Integer.MAX_VALUE;
            for(int i = 1;i<arr.length;i++){
                if(Math.abs(arr[i-1]-arr[i])<min){
                    min = Math.abs(arr[i-1]-arr[i]);
                }
            }
            System.out.println(min);
        }
    }
}
