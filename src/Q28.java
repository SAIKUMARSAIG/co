import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s = "1a2b3c4d5";
        String s = "5aart6i7io8o5o5b6";
        int n = s.length();
        int count = 0;
        for (int i=1;i<n-1;i++){
            char prev = s.charAt(i-1);
            char present = s.charAt(i);
            char next = s.charAt(i+1);
            if (Character.isDigit(prev) && Character.isDigit(next)
                && Character.isLetter(present)){
                if (!(Character.isDigit(prev) && Character.isDigit(next) && (i + 1 == n - 1))) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
