import java.util.*;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set<Character> check = new HashSet<>();
        for(int i = 0;i<s.length();i++){
            check.add(s.charAt(i));
        }
        if(check.size()%2==0){
            System.out.print("CHAT WITH HER!");
        }
        else{
            System.out.print("IGNORE HIM!");
        }
        sc.close();
    }
}
