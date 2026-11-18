import java.util.*;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while(tests-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int right = 1;
            int left = 0;
            int diff = 0;
            while(right<n){
                if(left == right){
                    right++;
                    continue;
                }
                diff = Math.abs(arr[left]-arr[right]);
                if(diff==k){
                    break;
                }
                else if(diff<k){
                    right++;
                }
                else{
                    left++;
                }
            }
            if(k==diff){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
