import java.util.*;
public class solution {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        int row = 1;
        int column = 1;
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[i].length;j++){
                matrix[i][j] = sc.nextInt();
                if(matrix[i][j]==1){
                    row += i;
                    column += j;
                }
            }
        }
        System.out.print(Math.abs(3-row)+Math.abs(3-column));
        sc.close();
    }
}
