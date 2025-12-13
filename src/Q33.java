import java.util.Arrays;
import java.util.Scanner;

public class Q33 {

    public static int morrisFellis(int n, int[] dp){
        if (n<=1){
            return dp[n];
        }
        int mod = 1_000_000_000+7;
        return dp[n] = ( morrisFellis(n-1,dp) + 7 * morrisFellis(n-2,dp) ) % mod;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mod = 1_000_000_000 + 7;
        int n = 3;
        int dp[] = new int[n+1];
        Arrays.fill(dp,1);
        morrisFellis(n,dp);
        System.out.println(dp[n]);
    }
}
