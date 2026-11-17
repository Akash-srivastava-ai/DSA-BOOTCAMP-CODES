import java.util.*;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while(tests-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            int left = 0;
            long ls = 0;
            long rs = 0;
            int right = n-1;
            int total = 0;
            int l = 0;
            int r = 0;
            while(left<=right){
                if(ls<=rs){
                    ls+=arr[left];
                    l++;
                    if(ls==rs){
                        total = r+l;
                    }
                    left++;
                }
                else{
                    rs+=arr[right];
                    r++;
                    if(ls==rs){
                        total = r+l;
                    }
                    right--;
                }
            }
            System.out.println(total);
        }
    }
}
