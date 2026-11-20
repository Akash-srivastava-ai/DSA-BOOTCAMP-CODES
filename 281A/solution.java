import java.util.*;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = "";
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z' && i==0){
                ch = (char)((int)ch-32);
                str+=ch;
                continue;
            }
            str+=ch;
        }
        System.out.print(str);
        sc.close();
    }
}
