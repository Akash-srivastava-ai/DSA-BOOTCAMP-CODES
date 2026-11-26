import java.util.*;
public class solution {
    static int match(int[] h,int[] a,int i,int c){
        if(i==h.length){
            return c;
        }
        int k;
        for(k = 0;k<h.length;k++){
            if(h[i]==a[k] && i!=k){
                c++;
            }
        }
        return match(h,a,i+1,c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        int[] a = new int[n];
        for(int i = 0;i<n;i++){
            h[i] = sc.nextInt();
            a[i] = sc.nextInt();
        }
        System.out.print(match(h,a,0,0));
        sc.close();
    }    
}
