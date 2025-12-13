import java.util.Scanner;

public class Q39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String order = sc.next();
        int c = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (char ch : order.toCharArray()) {
            int val = (ch - '0') + c;
            if (val < 10) sb.append(val);
            else sb.append((char)('A' + val - 10));
        }
        System.out.println(sb.toString());
    }
}
