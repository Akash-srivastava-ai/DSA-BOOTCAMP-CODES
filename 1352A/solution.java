import java.util.*;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int p =0;
            int d = 0;
            int temp = n;
            while(temp!=0){
                int digit = temp%10;
                if(digit>0){
                    p++;
                }
                temp/=10;
            }
            System.out.println(p);
            while(n!=0){
                int digit = n%10;
                if(digit>0){
                    System.out.print(digit*(int)Math.pow(10,d)+" ");
                }
                d++;
                n/=10;
            }
            System.out.println();
        }
        sc.close();
    }
}
