package Java;

import java.util.Scanner;
public class Q7{
    public static void main(String[] args) {
        Scanner scn = new Scanner( System.in );
        int y = 0;
        y = scn.nextInt();
        if(y % 400 == 0){
            System.out.println("Leap year");
        }
        else if(y % 100 == 0){
            System.out.println("Non-leap year, (Nearest leap year: " +(y+4)+ ", "+(y-4)+ ")");
        }
        else if(y % 4 == 0){
            System.out.println("Leap year");
        }
        else if((y+1) % 400 == 0){
            System.out.println("Non-leap year, (Nearest leap year: " +(y+1)+")");
        }
        else if((y+1) % 100 == 0){
            System.out.println("Non-leap year, (Nearest leap year: " +(y-3)+")");
        }
        else if((y+1) % 4 == 0){
            System.out.println("Non-leap year, (Nearest leap year: " +(y+1)+")");
        }
        else if((y+2) % 400 == 0){
            System.out.println("Non-leap year, (Nearest leap year: " +(y+2)+ ", "+(y-2)+ ")");
        }
        else if((y+2) % 100 == 0){
            System.out.println("Non-leap year, (Nearest leap year: " +(y-2)+")");
        }
        else if((y+2) % 4 == 0){
            System.out.println("Non-leap year, (Nearest leap year: " +(y+2)+ ", "+(y-2)+ ")");
        }
        else if((y-1) % 400 == 0){
            System.out.println("Non-leap year, (Nearest leap year: " +(y-1)+")");
        }
        else if((y-1) % 100 == 0){
            System.out.println("Non-leap year, (Nearest leap year: " +(y+3)+")");
        }
        else if((y-1) % 4 == 0){
            System.out.println("Non-leap year, (Nearest leap year: " +(y-1)+")");
        }
    }
}