import java.util.Scanner;
public class Q8{
    public static void main(String[] args) {
        Scanner scn = new Scanner ( System.in );
        int a = 0, b = 0, ans = 0, n = 0;
        a = scn.nextInt();
        b = scn.nextInt();
        int []c = new int [a];
        int []d = new int [b];
        int []check = new int [10000];
        for (int i = 0; i < a; i++){
            c[i] = scn.nextInt();
        }
        for (int i = 0; i < b; i++){
            d[i] = scn.nextInt();
        }
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                if(c[i] == d[j]){
                    check[n] = c[i];
                    n++;
                }
            }
        }
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(check[i] == check[j]){
                    check[j] = 0;
                }
            }
        }
        for(int i = 0; i < n; i++){
            if(check[i] != 0){
                ans++;
            }
        }
        System.out.println(ans);
        scn.close();
    }
}