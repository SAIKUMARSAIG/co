//Q4

import java.util.*;
import java.util.HashSet;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        Map<Character,Integer> hmap1 = new HashMap<>();
        Map<Character,Integer> hmap2 = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for (char c : s1.toCharArray()){
            hmap1.put(c,hmap1.getOrDefault(c,0)+1);
            set.add(c);
        }

        for (char c : s2.toCharArray()){
            hmap2.put(c,hmap2.getOrDefault(c,0)+1);
            set.add(c);
        }

        int cost = 0;
        for (char c : set){
            int val1 = hmap1.getOrDefault(c,0);
            int val2 = hmap2.getOrDefault(c,0);
            if (val2>val1){
                cost += Math.abs(val1-val2);
            }
        }
        System.out.println(cost);
    }
}
