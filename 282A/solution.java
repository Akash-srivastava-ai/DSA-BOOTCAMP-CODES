import java.util.*;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextLine();
        }
        int add = 0;
        int sub = 0;
        for(String i : arr){
            if(i.equals("++X") || i.equals("X++")){
                add++;
            }
            else{
                sub++;
            }
        }
        System.out.print(add-sub);
        sc.close();
    }
}
