import java.util.Scanner;
import java.util.Stack;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        int cnt = 0;
        for (int i : arr){
            if (stack.isEmpty()){
                stack.push(i);
                continue;
            }
            while (!stack.isEmpty() && i>=stack.peek()){
                stack.pop();
                cnt++;
            }
            stack.push(i);
        }
        System.out.println(cnt);
    }
}
