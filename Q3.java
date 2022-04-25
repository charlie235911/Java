package Java;

import java.util.Scanner;
public class Q3{
    public static void main(String[] args) {
        Scanner scn = new Scanner( System.in );
        int y = 0;
        y = scn.nextInt();
        int []x = new int[4];
        for (int i = 3 ; i >= 0 ; i--){
            x[i] = y % 10;
            y /= 10;
        }
        for (int i = 0 ; i < 4 ; i++){
            x[i] = (x[i]+7)%10;
        }
        int tempt = 0;
        tempt = x[0];
        x[0] = x[2];
        x[2] = tempt;
        tempt = x[1];
        x[1] = x[3];
        x[3] = tempt;
        for (int i = 0 ; i < 4 ; i++){
            System.out.print(+ x[i]);
        }
        System.out.print("\n");
    }
}