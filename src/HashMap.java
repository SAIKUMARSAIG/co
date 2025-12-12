import java.util.*;
import java.util.Scanner;

class HashMap1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = 'A';
        Map<Character,Integer> map = new HashMap<>();
        for (int i=1;i<=26;i++){
            map.put(c,i);
            c++;
        }
        System.out.println();
    }
}
