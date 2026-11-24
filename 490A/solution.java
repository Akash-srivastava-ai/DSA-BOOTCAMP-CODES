import java.util.*;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> pro = new ArrayList<>();
        List<Integer> pe = new ArrayList<>();
        List<Integer> math = new ArrayList<>();
        int[] arr = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            if(arr[i]==1){
                pro.add(i+1);
            }
            else if(arr[i]==2){
                math.add(i+1);
            }
            else{
                pe.add(i+1);
            }
        }
        int team = Math.min(pro.size(),math.size());
        team = Math.min(team,pe.size());
        System.out.println(team);
        for(int i = 0;i<team;i++){
            System.out.println(pro.get(i)+" "+math.get(i)+" "+pe.get(i));
        }
        sc.close();
    }    
}
