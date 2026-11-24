import java.util.*;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int[] a = new int[3];
            for(int i = 0;i<a.length;i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            System.out.println(a[1]);
        }
    }
}
