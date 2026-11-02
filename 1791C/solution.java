import java.util.*;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while(testcases-->0){
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int left = 0;
            int right = s.length()-1;
            while(s.charAt(left)!=s.charAt(right) && left<=right){
                n-=2;
                left++;
                right--;
            }
            System.out.println(n);
        }
        sc.close();
    }
}
