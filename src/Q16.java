import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int p = sc.nextInt();
//        int q = sc.nextInt();

        int n = 95,p=60,q=10;

        int cost = 0;
        if (n>=80){
            int remVal = n/80;
            cost+=remVal * p * 75;
            n = n % 80;
        }
        if (n>=8){
            double res = (double) n/(double) 8;
            cost += (int) Math.ceil(res) * q*75;
        }
        System.out.println(cost);


    }
}
