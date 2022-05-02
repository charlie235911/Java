import java.util.Scanner;
/**
 * Q10
 */
public class Q10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner ( System.in );
        int a = 0, check = 0;
        a = scn.nextInt();
        for (int i = 2; i <= a / 2; i++){
            for(int j = 2; j <= i; j++){
                if (i % j == 0 && j != i) {
                    break;
                }
                else if (i % j == 0 && j == i){
                    check = a - i;
                    for (int k = 2; k <= check; k++){
                        if (check % k == 0 && k != check) {
                            break;
                        }
                        else if (check % k == 0 && k == check){
                            System.out.println(i + "+" + check);
                        }
                    }
                }
            }
        }
        scn.close();
    }
}
