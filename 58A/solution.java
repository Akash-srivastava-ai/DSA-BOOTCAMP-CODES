import java.util.*;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = "hello";
        int left = 0;
        for(int i = 0;i<s.length();i++){
            if(str.charAt(left)==s.charAt(i)){
                left++;
            }
            if(left==5){
                System.out.print("YES");
                return;
            }
        }
        System.out.print("NO");
        sc.close();
    }
}
