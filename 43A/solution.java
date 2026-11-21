import java.util.*;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        HashMap<String,Integer> map = new HashMap<>();
        int max = 0;
        String str = "";
        while(n-->0){
            String s = sc.nextLine();
            int count = map.getOrDefault(s,0)+1;
            map.put(s, count);
            if(max<count){
                str = s;
                max = count;
            }
        }
        System.out.print(str);
        sc.close();
    }
}
