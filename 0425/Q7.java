import java.util.Scanner;
/**
 * Q7
 */
public class Q7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner ( System.in );
        int a = 0, ans = 1, tmp = 0;
        a = scn.nextInt();
        int []b = new int [a];
        for (int i = 0; i < a; i++){
            b[i] = scn.nextInt();
        }
        for(int i = 0; i < a; i++){
            tmp = b[i];
            for(int j = i+1; j < a;j++){
                tmp *= b[j];
            }
            if (tmp > ans) {
                ans = tmp;
            }
        }
        System.out.println(ans);
        scn.close();
    }   
}