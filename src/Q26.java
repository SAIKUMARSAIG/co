import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        String s = sc.next();

        int count = 0;
        for (char c : s.toCharArray()){
            String curr = String.valueOf((int)c);
            for (char ch : curr.toCharArray()){
                int val = ch - '0';
                if (map.containsKey(val)){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
