import java.util.Scanner;
public class Q4{
    public static void main(String[] args) {
        Scanner scn = new Scanner( System.in );
        int x = 0, y = 0;
        x = scn.nextInt();
        y = scn.nextInt();
        System.out.println(x +"+" + y +"=" + (x+y));
        System.out.println(x +"*" + y +"=" + (x*y));
        System.out.println(x +"-" + y +"=" + (x-y));
        System.out.println(x +"/" + y +"=" + (x/y) +"..." + (x%y));
    }
}