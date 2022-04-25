import java.util.Scanner;
public class Q3{
    public static void main(String[] args) {
        Scanner scn = new Scanner ( System.in );
        int a = 0, ans = 0;
        a = scn.nextInt();
        for(int i = 0; i < a; i++){
            ans += (1+i) * (2+i);
        }
        System.out.println(ans);
        scn.close();
    }
}