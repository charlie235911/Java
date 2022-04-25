import java.util.Scanner;
public class Q4{
    public static void main(String[] args) {
        Scanner scn = new Scanner ( System.in );
        int a = 0, ans = 0, count = 0;
        a = scn.nextInt();
        while(a > 0){
            ans += a % 10;
            a = a / 10;
            count++;
        }
        System.out.println(count);
        System.out.println(ans);
        scn.close();
    }
}