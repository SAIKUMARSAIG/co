//Q2

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum =0;
        for (int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        int cnt = 0;
        int curSum = 0;
        for (int i : arr){
            curSum+=i;
            int val = sum - curSum;
            if (val%2==0){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
