import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<Character> list = new ArrayList<>();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)>'0' && s.charAt(i)<'4'){
                list.add(s.charAt(i));
            }
        }
        list.sort(null);
        System.out.print(list.get(0));
        for(int i = 1;i<list.size();i++){
            System.out.print("+"+list.get(i));
        }
        sc.close();
    }
}
