import java.util.*;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int remove = 0;
        String str = sc.nextLine();
        for(int i = 1;i<n;i++){
            if(str.charAt(i)==str.charAt(i-1)){
                remove++;
            }
        }
        System.out.print(remove);
        sc.close();
    }
}
