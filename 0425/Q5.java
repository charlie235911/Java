import java.util.Scanner;
public class Q5{
    public static void main(String[] args) {
        Scanner scn = new Scanner ( System.in );
        int a = 0, ans = 0, count1 = 0, count2 = 0;
        a = scn.nextInt();
        while(a > 0){
            if(a % 5 == 0){
                count1++;
            }
            else if(a % 2 == 0){
                count2++;
            }
            a -= 1;
        }
        if(count1 >= count2){
            ans = count2;
        }
        else{
            ans = count1;
        }
        System.out.println(ans);
        scn.close();
    }
}