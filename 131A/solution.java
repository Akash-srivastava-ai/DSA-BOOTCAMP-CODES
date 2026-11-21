import java.util.*;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = "";
        for(int i = 1;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z'){
                System.out.print(s);
                return;
            }
        }
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z'){
                str+=(char)(ch-32);
                continue;
            }
            str+=(char)(ch+32);
        }
        System.out.print(str);
        sc.close();
    }
}
