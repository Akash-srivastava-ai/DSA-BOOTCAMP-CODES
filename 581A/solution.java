import java.util.*;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int b = sc.nextInt();
        int c = Math.min(r,b);
        System.out.print(c+" ");
        r-=c;
        b-=c;
        int d = Math.max(r,b);
        if(d%2==0){
            System.out.print(d/2);
        }
        else{
            System.out.print((d-1)/2);
        }
        sc.close();
    }
}
