import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i = 0;
        int n = s.length();
        int count = 0;
        while (i<n){
            int start = i;
            while (i<n && Character.isDigit(s.charAt(i))) i++;
            int end = i-1;
            if (start>0 && end<n && Character.isLetter(s.charAt(start-1)) && Character.isLetter(s.charAt(end+1))){
                count++;
            }
            i++;
        }
        System.out.println(count);

    }
}
