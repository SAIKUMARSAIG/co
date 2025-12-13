import java.util.Arrays;
import java.util.Scanner;

public class Q41 {
    public static char findGrade(int n){
        if (n>=10 && n<=40){
            return 'F';
        }else if (n>=41 && n<=50) {
            return 'C';
        }else if (n>=51 && n<=60) {
            return 'B';
        }else if (n>=61 && n<=80) {
            return 'A';
        }
        return 'S';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        char res[] = new char[n];
        int ind = 0;
        for (int i : arr){
            char result = findGrade(i);
            res[ind++] = result;
        }
        System.out.println(Arrays.toString(res));
    }
}
