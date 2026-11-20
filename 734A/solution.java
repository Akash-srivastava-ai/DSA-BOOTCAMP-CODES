import java.util.*;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int a = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='A'){
                a++;
            }
        }
        if(a>n-a){
            System.out.print("Anton");
        }
        else if(a<n-a){
            System.out.print("Danik");
        }
        else{
            System.out.print("Friendship");
        }
        sc.close();
    }
}
