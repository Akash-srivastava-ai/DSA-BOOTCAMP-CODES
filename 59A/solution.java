import java.util.*;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int u = 0;
        int l = 0;
        String str = "";
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z'){
                l++;
            }
            else{
                u++;
            }
        }
        if(l>=u){
            for(int i = 0;i<s.length();i++){
                char ch = s.charAt(i);
                if(ch>='A' && ch<='Z'){
                    str+=(char)(ch+32);
                    continue;
                }
                str+=ch;
            }
        }
        else{
            for(int i = 0;i<s.length();i++){
                char ch = s.charAt(i);
                if(ch>='a' && ch<='z'){
                    str+=(char)(ch-32);
                    continue;
                }
                str+=ch;
            }
        }
        System.out.print(str);
        sc.close();
    }
}
