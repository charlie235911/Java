import java.util.Scanner;
public class Q1{
    public static void main(String[] args) {
        Scanner scn = new Scanner ( System.in );
        char []a = new char [1000];
        String str;
        str = scn.nextLine();
        for(int i = 0; i < str.length(); i++){
            a[i] = str.charAt(i);
        }
        for(int i = str.length()-1; i >= 0 ; i--){
            System.out.print(a[i]);
        }
        System.out.print("\n");
        scn.close();
    }
}