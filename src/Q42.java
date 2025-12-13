import java.util.Scanner;

public class Q42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  s = sc.nextLine();
        String curr = sc.next();
        int cnt = 0;
        for (String each : s.split("\\s+")){
            if (curr.equals(each)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
