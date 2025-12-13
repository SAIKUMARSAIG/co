import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer,Integer> map = new HashMap<>();
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//        for (int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
        int n = 6;
        int arr[] = {5,13, 6, 12, 9, 9};

        int res[] = new int[2];
        int max = 0;
        for (int i : arr){
            int val = 18 - i;
            if (map.containsKey(val)){
                int pro = i * val;
                if (max<pro){
                    res[0] = i;
                    res[1] = val;
                }
                max = Math.max(max,pro);
            }
            map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.println(Arrays.toString(res));
    }
}
