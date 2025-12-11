//Q10

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int dopamine = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : arr){
            if (i<l || i>r){
                dopamine--;
            }else{
                dopamine++;
            }
            min = Math.min(min,dopamine);
            max = Math.max(max,dopamine);
        }
        System.out.println(max+" "+min);
    }
}
