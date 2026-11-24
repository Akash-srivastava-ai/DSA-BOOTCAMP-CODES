import java.util.*;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for(int i = 0;i<n;i++){
                a[i]=sc.nextInt();
            }
            for(int i = 0;i<n;i++){
                b[i] = sc.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(b);
            int i = n-1;
            int j = n-1;
            int sum = 0;
            while(n-->0){
                if(a[i]>b[j]){
                    sum+=a[i--];
                }
                else if(k-->0){
                    sum+=b[j--];
                }
                else{
                    sum+=a[i--];
                }
            }
            System.out.println(sum);
        }
    }
}
