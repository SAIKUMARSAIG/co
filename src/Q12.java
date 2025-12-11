import java.util.Arrays;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int res[] = new int[n];
        for (int i=0;i<n;i++){
            int val = 0;
            if (i==0){
                int next = arr[i+1];
                int last = arr[n-1];
                if (arr[i]<next){
                    val++;
                }
                if (arr[i]<last){
                    val++;
                }
            } else if (i==n-1) {
                int first = arr[0];
                int sLast = arr[n-2];
                if (arr[i]<first){
                    val++;
                }
                if (arr[i]<sLast){
                    val++;
                }
            }else{
                int last = arr[i-1];
                int next = arr[i+1];
                if (arr[i]<last){
                    val++;
                }
                if (arr[i]<next){
                    val++;
                }
            }
            res[i] = val;
        }

        System.out.println(Arrays.toString(res));
    }
}
