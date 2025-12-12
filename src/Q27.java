import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q27 {

    public static boolean isPerfectSquare(int n){
        int k = (int)Math.sqrt(n);

        return k*k == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Map<Character,Integer> map = new HashMap<>();
        Map<Integer,Character> map1 = new HashMap<>();
        char alpa = 'a';
        for (int i=1;i<=26;i++){
            map.put(alpa,i);
            map1.put(i,alpa);
            alpa++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (isPerfectSquare(map.get(c))){
                int val = (int) Math.sqrt(map.get(c));
                char ch = map1.get(val);
                sb.append(ch);
            }else{
                sb.append(c);
            }
        }

        System.out.println(sb);
    }
}
