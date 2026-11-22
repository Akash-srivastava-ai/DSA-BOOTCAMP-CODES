import java.util.*;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            int m = sc.nextInt();
            int[] arr = new int[m];
            for(int i = 0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            boolean good = true;
            Arrays.sort(arr);
            for(int i = 1;i<m;i++){
                if(Math.abs(arr[i]-arr[i-1])>1){
                    System.out.println("NO");
                    good = false;
                    break;
                }
            }
            if(good){
                System.out.println("YES");
            }
        }
        sc.close();
    }
}
