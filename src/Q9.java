//Q9

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        char c = 'A';
        Scanner sc = new Scanner(System.in);
        Map<Character,Integer> map = new HashMap<>();
        for (int i=1;i<=26;i++){
            map.put(c++,i);
        }
//        System.out.println(map);
        String s = sc.next();
        int count = s.length();
        for (int i = 0;i<s.length()-1;i++){
            int num = Integer.parseInt(s.substring(i,i+2));
//            System.out.println(num);
            if (num<=26){
                count++;
            }
        }
        System.out.println(count);

    }
}
