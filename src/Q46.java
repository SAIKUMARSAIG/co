import java.util.Scanner;

public class Q46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of students placed in CSE: ");
        int cse = sc.nextInt();
        System.out.println("Enter the no of students placed in ECE: ");
        int ece = sc.nextInt();
        System.out.println("Enter the no of students placed in MECH: ");
        int mech = sc.nextInt();

        if (cse <0 || ece<0 || mech<0){
            System.out.println("Input is Invalid");
        }else if (cse==ece && ece==mech && mech==cse){
            System.out.println("None of the department has got the\n" +
                    "highest placement");
        } else if (cse>ece && cse>mech) {
            System.out.println("CSE");
        } else if (ece>cse && ece>mech) {
            System.out.println("ECE");
        }else{
            System.out.println("MECH");
        }

    }
}
