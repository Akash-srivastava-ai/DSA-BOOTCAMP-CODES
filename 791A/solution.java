import java.util.*;
public class solution {
    public static void main(String[] arge){
        Scanner sc = new Scanner(System.in);
        int limak = sc.nextInt();
        int bob = sc.nextInt();
        int years = 0;
        while(limak<=bob){
            limak*=3;
            bob*=2;
            years++;
        }
        System.out.print(years);
        sc.close();
    }    
}
