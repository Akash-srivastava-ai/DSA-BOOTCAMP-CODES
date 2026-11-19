import java.util.*;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        sc.nextLine();
        while(tests-->0){
            String str = sc.nextLine();
            char start = str.charAt(0);
            int length = str.length();
            char end = str.charAt(length-1);
            if(length>10){
                System.out.println(start+""+(length-2)+""+end);
            }
            else{
                System.out.println(str);
            }
        }
        sc.close();
    }
}
