import java.util.*;
public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        while(tests-->0){
            int z = sc.nextInt();
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = z;
            boolean work = true;
            List<Integer> ans = new ArrayList<>();
            int[] mon = new int[n];
            int[] pol = new int[m];
            for(int i = 0;i<n;i++){
                mon[i] = sc.nextInt();
            }
            for(int i = 0;i<m;i++){
                pol[i] = sc.nextInt();
            }
            int i = 0;
            int j = 0;
            while(i<n && j<m){
                if(mon[i]<=k){
                ans.add(mon[i]);
                if(mon[i]==0) k++;
                i++;
                }
                else if(pol[j]<=k){
                    ans.add(pol[j]);
                    if(pol[j]==0) k++;
                    j++;
                }
                else{
                    work = false;
                    break;
                }
            }
            while(i<n && work){
                if(mon[i]>k){
                    work = false;
                    break;
                }
                if(mon[i]==0){
                    k++;
                }
                ans.add(mon[i++]);
            }
            while(j<m && work){
                if(pol[j]>k){
                    work = false;
                    break;
                }
                if(pol[j]==0){
                    k++;
                }
                ans.add(pol[j++]);
            }
            if(work){
                for(int ele : ans){
                    System.out.print(ele+" ");
                }
                System.out.println();
            }
            else{
                System.out.println(-1);
            }
        }
    }
}
