import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Map<Character,Integer> map = new HashMap<>();
        for (char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE;
        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            char key = entry.getKey();
            int val = entry.getValue();
            if (val%2==0){
                min = Math.min(min,val);
            }else{
                max = Math.max(max,val);
            }
        }
        System.out.println(Math.abs(max-min));
    }
}
