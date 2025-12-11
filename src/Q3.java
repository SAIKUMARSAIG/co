//Q3

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int cnt = 0;
        for (int i=0;i<n-2;i++){
            int a = arr[i], b=arr[i+1],c=arr[i+2];
            if (a+c == b){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
