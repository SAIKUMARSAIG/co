//Q5

import java.util.Scanner;

public class Q5 {

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
        int n = sc.nextInt();
        String[] strs = new String[n];
        for (int i=0;i<n;i++){
            strs[i] = sc.next();
        }
        int count = 0;
        for (String s : strs){
            String curr = s.replaceAll("[AEIOUaeiou]","");
            count  = Math.max(count,factorial(curr.length()));
            System.out.println(curr);
        }

        System.out.println(count);

    }
}
