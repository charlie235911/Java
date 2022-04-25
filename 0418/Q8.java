package Java;

import java.util.Scanner;
public class Q8{
    public static void main(String[] args) {
        Scanner scn = new Scanner( System.in );
        int m = 0, d = 0;
        m = scn.nextInt();
        d = scn.nextInt();
        if((m == 1 && d >= 21)||(m == 2 && d <= 18)){
            System.out.println("Aquarius");
        }
        else if((m == 2 && d >= 19)||(m == 3 && d <= 20)){
            System.out.println("Pisces");
        }
        else if((m == 3 && d >= 21)||(m == 4 && d <= 20)){
            System.out.println("Aries");
        }
        else if((m == 4 && d >= 21)||(m == 5 && d <= 21)){
            System.out.println("Taurus");
        }
        else if((m == 5 && d >= 22)||(m == 6 && d <= 21)){
            System.out.println("Gemini");
        }
        else if((m == 6 && d >= 22)||(m == 7 && d <= 22)){
            System.out.println("Cancer");
        }
        else if((m == 7 && d >= 23)||(m == 8 && d <= 23)){
            System.out.println("Leo");
        }
        else if((m == 8 && d >= 24)||(m == 9 && d <= 23)){
            System.out.println("Virgo");
        }
        else if((m == 9 && d >= 24)||(m == 10 && d <= 23)){
            System.out.println("Libra");
        }
        else if((m == 10 && d >= 24)||(m == 11 && d <= 22)){
            System.out.println("Scorpio");
        }
        else if((m == 11 && d >= 23)||(m == 12 && d <= 21)){
            System.out.println("Sagittarius");
        }
        else if((m == 12 && d >= 22)||(m == 1 && d <= 20)){
            System.out.println("Capricorn");
        }
    }
}