import java.util.Scanner;

public class Q50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        String sb = new StringBuilder(num).reverse().toString();
        if (sb.equals(num)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }

    }
}
