import java.util.*;
public class solution {
    static boolean diff(int n){
        int a = (n/1000)%10;
        int b = (n/100)%10;
        int c = (n/10)%10;
        int d = n%10;
        if(a==b||a==c||a==d||b==c||b==d||c==d){
            return false;
        }
        return true;
    }
    static int year(int n){
        if(diff(n)){
            return n;
        }
        int y = year(n+1);
        return y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(year(n+1));
        sc.close();
    }
}
