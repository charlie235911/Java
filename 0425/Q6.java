import java.util.Scanner;
public class Q6{
    public static void main(String[] args) {
        Scanner scn = new Scanner ( System.in );
        int a = 0, ans = 1;
        a = scn.nextInt();
        while(a >= ans){
            a -= ans;
            ans++; 
        }
        System.out.println(ans-1);
        scn.close();
    }
}