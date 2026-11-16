import java.util.*;
public class solution {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int test = sc.nextInt();
       while(test-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }
           int count = 0;
           int j = 0;
           for(int i = 0;i<n;i++){
            j = i;
            while(j+1<n && arr[j]==arr[j+1]){
                j++;
            }
            if((i==0||arr[i-1]>arr[i]) && (j==n-1 || arr[j+1]>arr[j])){
                count++;
            }
            i=j;
           }
            if(count>1){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
        sc.close();
    } 
}
