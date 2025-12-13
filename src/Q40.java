import java.util.Scanner;

public class Q40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "Amcatuff@ #% 123";
        int alpa = 0, digg = 0, spaces = 0, special = 0;
        for (char c : s.toCharArray()){
            if (Character.isLetter(c)){
                alpa++;
            } else if (Character.isDigit(c)) {
                digg++;
            } else if (Character.isSpaceChar(c)) {
                spaces++;
            }else{
                special++;
            }
        }
        System.out.println("Alphabets - "+alpa);
        System.out.println("Digits - "+digg);
        System.out.println("Space - "+spaces);
        System.out.println("Special Character - "+special);
    }
}
