import java.util.*;
public class solution {
    static int gcd(int a,int b){
        int q = Math.max(a,b);
        int d = Math.min(a,b);
        int rem = 0;
        while(q%d!=0){
            rem = q%d;
            q = d;
            d = rem;
        }
        return d;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(n-->0){
            String s = sc.nextLine();
            String s2 = sc.nextLine();
            int lcm = s.length()*s2.length();
            lcm/=gcd(s.length(),s2.length());
            String s3 = "";
            while(s3.length()<lcm){
                s3+=s;
            }
            String s4 = "";
            while(s4.length()<lcm){
                s4+=s2;
            }
            if(s3.equals(s4)){
                System.out.println(s3);
            }
            else{
                System.out.println(-1);
            }
        }
    }
}
