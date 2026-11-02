import java.util.*;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while(testcases-->0){
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int slow = 0;
            String str = "";
            for(int i = 1;i<n;i++){
                if(s.charAt(slow)==s.charAt(i)){
                    str+=s.charAt(slow);
                    slow = i+1;
                    i=slow;
                }
            }
            System.out.println(str);
        }
        sc.close();
    }
}
