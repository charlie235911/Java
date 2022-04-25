import java.util.Scanner;
public class Q2{
    public static void main(String[] args) {
        Scanner scn = new Scanner ( System.in );
        int a = 0;
        a = scn.nextInt();
        double []b = new double [a];
        for (int i = 0; i < a; i++){
            b[i] = scn.nextDouble();
        }
        for(int i = 0; i < a-1; i++){
            for(int j = i+1; j < a; j++){
                if(b[i] < b[j]){
                    double tmp = b[i];
                    b[i] = b[j];
                    b[j] = tmp;
                }
            }
        }
        System.out.printf("max: %.2f\n", b[0]);
        System.out.printf("min: %.2f\n", b[a-1]);
        scn.close();
    }
}