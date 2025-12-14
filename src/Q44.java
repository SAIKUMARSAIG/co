import java.util.Scanner;

public class Q44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of pizzas bought: ");
        int pizzas = sc.nextInt();
        System.out.println("Enter the no of puffs bought: ");
        int puffs = sc.nextInt();
        System.out.println("Enter the no of cool drinks bought: ");
        int cooldrinks = sc.nextInt();
        System.out.println(pizzas*100+puffs*20+cooldrinks*10);
    }
}
