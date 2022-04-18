import java.util.Scanner;
public class Q5{
    public static void main(String[] args) {
        Scanner scn = new Scanner( System.in );
        int x = 0, y = 0;
        double ans = 0;
        x = scn.nextInt();
        y = scn.nextInt();
        ans = Math.sqrt( (x*x + y*y) );
        if(ans > 100){
            System.out.println("outside");
        }
        else{
            System.out.println("inside");
        }
    }
}