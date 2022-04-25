package Java;

import java.util.Scanner;
public class Q9{
    public static void main(String[] args) {
        Scanner scn = new Scanner( System.in );
        int a = 0, b = 0, c = 0, check = 0;
        a = scn.nextInt();
        b = scn.nextInt();
        c = scn.nextInt();
        if(a > b || b > c || a > c){
            check = 1;
        }
        if(a+b <= c || check == 1){
            System.out.println("False");
        }
        else{
            System.out.println("True");
        }
    }
}