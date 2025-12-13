import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = 2;
        int[][] arr = new int[r][];
        for (int i = 0;i<r;i++){
            arr[i] = new int[sc.nextInt()];
        }
        for (int i=0;i<r;i++){
            for (int j = 0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for (int a[] : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
