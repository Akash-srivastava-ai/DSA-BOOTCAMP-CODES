import java.util.*;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while(testcases-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
            int right = n-1;
            int left = 0;
            int count = 1;
            int[] arr2 = new int[n];
            for(int i = 0;i <n;i++){
                if(count%2!=0){
                    arr2[i] = arr[left++];
                }
                else{
                    arr2[i]  = arr[right--];
                }
                count++;
            }
            for(int i : arr2){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
