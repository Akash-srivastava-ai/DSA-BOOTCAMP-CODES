import java.util.*;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int room = sc.nextInt();
        int letter = sc.nextInt();
        long[] arr = new long[room];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextLong();
            if(i>0){
                arr[i] = arr[i]+arr[i-1];
            }
        }
        long[] b = new long[letter];
        for(int i = 0;i<b.length;i++){
            b[i] = sc.nextLong();
        }
        for(int i = 0;i<letter;i++){
            int left = 0;
            int right = room-1;
            long ans = -1;
            int ans_id = 0;
            while(left<=right){
                int mid = left+(right-left)/2;
                if(b[i]<=arr[mid]){
                    ans = arr[mid];
                    ans_id = mid;
                    right = mid-1;
                }
                else if(b[i]>arr[mid]){
                    left = mid+1;
                }
            }
            System.out.print(ans_id+1+" ");
            if(ans_id>0){
                System.out.print(b[i]-arr[ans_id-1]);
            }
            else{
                System.out.print(b[i]);
            }
            System.out.println();
        }
        sc.close();
    }
}
