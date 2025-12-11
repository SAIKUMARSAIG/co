import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        Map<Character,Integer> map1 = new HashMap<>();
        for (char c : s.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        Map<Integer,Integer> map2 = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for (Map.Entry<Character,Integer> entry : map1.entrySet()){
            int val = entry.getValue();
            map2.put(val,map2.getOrDefault(val,0)+1);
        }

        int maxFreq = 0;
        for (Map.Entry<Integer,Integer> entry : map2.entrySet()){
            int key = entry.getKey();
            int val = entry.getValue();
            if (maxFreq<val){
                maxFreq = val;
                ans = key;
            }else if (maxFreq == val && key<val){
                ans = key;
            }
        }
        System.out.println(ans);
    }
}
