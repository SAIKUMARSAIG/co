import java.util.Scanner;

public class Q45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        for (int i=0;i<n-1;i = i+2){
            String curr = s.substring(i,i+2);
            char c = (char) Integer.parseInt(curr);
            System.out.println(curr+" - "+c);
        }
    }
}
