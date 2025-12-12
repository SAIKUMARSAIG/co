import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int min = Integer.MAX_VALUE;
        int n = s.length();
        int count = 0, c1=0;
        for (int i=0;i<n;i++){
            char expected = (i%2==0)?'Y':'X';
            if (s.charAt(i)!=expected){
                count++;
            }

            char expect = (i%2==0)?'X':'Y';
            if (s.charAt(i)!=expect){
                c1++;
            }
        }
        System.out.println(Math.min(c1,count));
    }
}
