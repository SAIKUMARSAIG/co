//Q6

import java.util.Scanner;

public class Q6 {
    public static int factorial(int n){
        if (n==0){
            return 0;
        }
        int fact = 1;
        for (int i=2;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String temp = s.replaceAll("[AEIOUaeiou]","");
        System.out.println(factorial(temp.length()));
    }
}
