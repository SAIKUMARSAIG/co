//Q8
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split("\\s+");
        Map<String,Integer> map = new HashMap<>();
        for (String i : words){
            String curr = i.charAt(0) + "" + i.charAt(i.length()-1);
            map.put(curr,map.getOrDefault(curr,0)+1);
        }

        String ans = "";
        int count = 0;
        for (Map.Entry<String,Integer> entry : map.entrySet()){
            String key = entry.getKey();
            int val = entry.getValue();
            if (val>count){
                count = val;
                ans = key;
            }
        }
        System.out.println(ans);
    }
}
