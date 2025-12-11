//Q1

import java.util.HashMap;
import java.util.Map;

public class Q1 {
    public static void main(String[] args) {
        String s = "abcaba";
        Map<Character,Integer> hmap = new HashMap<>();
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            hmap.putIfAbsent(c,i+1);
        }
        System.out.println(hmap);
        StringBuilder sb = new StringBuilder();
        for (char c: s.toCharArray()){
            int val = hmap.get(c);
            sb.repeat(c,val).append("-");
        }
        System.out.println(sb);
        String ans = sb.toString().substring(0,sb.length()-1);
        System.out.println(ans);
    }
}
