import java.util.Scanner;
/**
 * Q7
 */
public class Q7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner ( System.in );
        int a = 0, n = 0, check = 0, count = 0, count2 = 0, count3 = 0;
        a = scn.nextInt();
        int []b = new int [a];
        int []ans = new int [1000];
        for (int i = 0; i < 1000; i++){
            ans[i] = 1;
        }
        for (int i = 0; i < a; i++){
            b[i] = scn.nextInt();
        }
        for(int i = 0; i < a; i++){
            if(b[i] > 0){
                ans[n] *= b[i];
                count3++;
            }
            else if(b[i] <= 0){
                check = ans[n] * b[i];
                if(i+1 < a){
                    if(check * b[i+1] > 0){
                        ans[n] = check * b[i+1];
                        i++;
                        count2 = 1;
                    }
                    else if(check * b[i+1] <= 0){
                        n++;
                    }
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = i+1; j <= n; j++){
                if(ans[i] < ans[j]){
                    int tmp = ans[i];
                    ans[i] = ans[j];
                    ans[j] = tmp;
                }
            } 
        }
        for (int i = 0; i < a; i++){
            if(b[i] == 0){
                count++;
            }
        }
        if(count == a && ans[0] == 1){
            ans[0] = 0;
        }
        if(count2 == 0){
            if(count3 == 0){
                ans[0] = 0;
            }
        }
        if(a == 1){
            ans[0] = b[0];
        }
        System.out.println(ans[0]);
        scn.close();
    }   
}