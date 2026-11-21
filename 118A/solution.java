import java.util.*;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = "";
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='Y'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='y'){
                
            }
            else if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){
                str+=".";
                if(ch>='A' && ch<='Z'){
                    str+=(char)(ch+32);
                }
                else{
                    str+=ch;
                }
            }
        }
        System.out.print(str);
        sc.close();
    }
}
