import java.util.*;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while(tests-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int q = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            int left = 0;
            int l = 0;
            long total = 0;
            for(int right = 0;right<arr.length;right++){
                l = right - left+1;
                if(arr[right]>q){
                    l--;
                    if(l>= k ){
                        total+= ((long)(l-k+1)*(l-k+2))/2;
                    }
                    left = right+1;
                    l = right - left+1;
                }
            }
            if(l>=k){
              total+= ((long)(l-k+1)*(l-k+2))/2;

            }
            System.out.println(total);
        }
        sc.close();
    }    
}
