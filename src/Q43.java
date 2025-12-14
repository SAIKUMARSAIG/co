import java.util.Scanner;

public class Q43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int litres = sc.nextInt();
        int distance = sc.nextInt();

        System.out.printf("%.2f\n",(litres*100.0f)/distance);
        System.out.printf("%.2f\n",(distance*0.6214)/(litres*0.2642));
    }
}
