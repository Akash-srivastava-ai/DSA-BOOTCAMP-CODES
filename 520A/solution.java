import java.util.*;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        if(n<26){
            System.out.print("NO");
            return;
        }
        Set<Character> check = new HashSet<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='A' && ch<='Z'){
                ch = (char)(ch+32);
            }
            check.add(ch);
        }
        if(check.size()==26){
           System.out.print("Yes");
           sc.close();
           return;
        }
        System.out.print("NO");
        sc.close();
    }
}
