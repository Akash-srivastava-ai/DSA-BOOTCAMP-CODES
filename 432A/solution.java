import java.util.*;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k  = sc.nextInt();
        int[] a = new int[n];
        int count = 0;
        for(int i = 0;i<a.length;i++){
            a[i]=sc.nextInt();
            if(a[i]<=(5-k)){
                count++;
            }
        }
        System.out.print(count/3);
        sc.close();
    }
}
