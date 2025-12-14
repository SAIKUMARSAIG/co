import java.util.Scanner;

public class Q47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NO OF TICEKT");
        int tickets = sc.nextInt();
        if (tickets<5 || tickets>40){
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
            return;
        }
        System.out.println("Do you want refreshment : ");
        char refreshment = sc.next().charAt(0);
        System.out.println("Do you have coupon : ");
        char coupon = sc.next().charAt(0);
        System.out.println("Enter the circle ");
        char circle = sc.next().charAt(0);

        if (circle!='k' && circle!='q'){
            System.out.println("Invalid Input");
            return;
        }
        double total = 0;
        int ticketPrice = 150;
        if (circle == 'k') ticketPrice = 75;

        total = total + ticketPrice*tickets;

        if (tickets>20) total = total*((double) 90/(double) 100);

        if (refreshment == 'y'){

        }

    }
}
