import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q49 {

    public static List<Integer> prime(int a, int b){
        List<Integer> list = new ArrayList<>();
        if (a==b) return list;
        for (int i=a; i<=b; i++){
            boolean isPrime = true;
            for (int j=2;j<=i;j++){
                if (i==j) continue;
                if (i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(prime(a,b));
    }
}
