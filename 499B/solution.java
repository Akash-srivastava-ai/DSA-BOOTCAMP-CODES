import java.util.*;
public class solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        HashMap<String,String> map = new HashMap<>();
        while(m-->0){
            String s = sc.next();
            String s2 = sc.next();
            String val = "";
            if(s.length()<=s2.length()){
                val+=s;
            }
            else{
                val+=s2;
            }
            map.put(s,val);
        }
        String str = "";
        while(n-->0){
            String s = sc.next();
            str+=" ";
            str += map.get(s);
        }
        str=str.trim();
        System.out.print(str);
        sc.close();
    }
}
