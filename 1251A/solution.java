import java.util.*;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        sc.nextLine();
        while(tests-->0){
            String s = sc.nextLine();
            String str = "";
            String res = "";
            int left = 0;
            int right = 1;
            int[] freq = new int[26];
            while(left<s.length()){
                if(right==s.length()){
                    str+=s.charAt(left);
                    freq[s.charAt(left)-'a']++;
                    break;
                }
                if(s.charAt(left)!=s.charAt(right)){
                    str+=s.charAt(left);
                    freq[s.charAt(left)-'a']++;
                    left++;
                    right++;
                }
                else{
                    left = right+1;
                    right = left+1;
                }
            }
            for(int i = 0;i<freq.length;i++){
                if(freq[i]>0){
                    res+=(char)((int)'a'+i);
                }
            }
            System.out.println(res);
        }
    }
}
