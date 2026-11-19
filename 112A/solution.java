import java.util.*;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s2 = sc.nextLine();
        s = s.toLowerCase();
        s2 = s2.toLowerCase();
        int length = 0;
        while(length<s.length()){
            if(s.charAt(length)!=s2.charAt(length)){
                if(s.charAt(length)<s2.charAt(length)){
                    System.out.print(-1);
                    return;
                }
                else{
                    System.out.print(1);
                    return;
                }
            }
            length++;
        }
        System.out.print(0);
        sc.close();
    }
}
