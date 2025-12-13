import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "112";
        int ind = 0;
        int n = s.length();
        long sum = 0;
        System.out.println(sum(s,sum,ind,n));
    }
    public static long sum(String s,long sum, int ind,int n){
        if (ind == n){
            return sum;
        }
        long val = Integer.parseInt(s.substring(0,ind+1));
        sum += val;
        return sum(s,sum,ind+1,n);
    }
}
