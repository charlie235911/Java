import java.util.Scanner;
public class Q9{
    public static void main(String[] args) {
        Scanner scn = new Scanner ( System.in );
        int a = 0, b = 0, c = 0, d = 0;
        a = scn.nextInt();
        b = scn.nextInt();
        c = scn.nextInt();
        d = scn.nextInt();
        int [][]e = new int [a][b];
        int [][]f = new int [c][d];
        int [][]ans = new int [a][d];
        for (int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                e[i][j] = scn.nextInt();
            }
        }
        for (int i = 0; i < c; i++){
            for(int j = 0; j < d; j++){
                f[i][j] = scn.nextInt();
            }
        }
        for(int i = 0; i < a; i++){
            for(int j = 0; j < d; j++){
                for(int k = 0; k < b; k++){
                    ans[i][j] += e[i][k] * f[k][j];
                }
            }
        }
        for (int i = 0; i < a; i++){
            for(int j = 0; j < d; j++){
                System.out.printf("%4d\t", ans[i][j]);
            }
            System.out.printf("\n");
            scn.close();
        }
    }
}