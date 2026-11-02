import java.util.*;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = n-1;
        int sereja = 0;
        int dima = 0;
        while(left<=right){
            if(arr[left]>arr[right]){
                sereja += arr[left];
                left++;
            }
            else{
                sereja+=arr[right];
                right--;
            }
            if(left>right){
                break;
            }
            if(arr[left]>arr[right]){
                dima+=arr[left];
                left++;
            }
            else{
                dima+=arr[right];
                right--;
            }
        }
        System.out.print(sereja+" "+dima);
        sc.close();
    }
}
