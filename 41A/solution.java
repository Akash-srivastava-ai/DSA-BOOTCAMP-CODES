import java.util.*;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        if(s.length()!=t.length()){
            System.out.print("NO");
            return;
        }
        int left = 0;
        int right = t.length()-1;
        while(left<s.length()){
            if(s.charAt(left++)!=t.charAt(right--)){
                System.out.print("NO");
                return;
            }
        }
        System.out.print("YES");
        sc.close();
    }
}
