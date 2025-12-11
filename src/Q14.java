import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        Map<Integer,Integer> map = new HashMap<>();
        for (int i[] : arr){
            for (int k : i){
                if (k<0){
                    continue;
                }
                map.put(k,map.getOrDefault(k,0)+1);
            }
        }

        int ans = Integer.MAX_VALUE;
        for (int i : map.keySet()){
            int val = map.get(i);
            if (val<2){
                ans = Math.min(ans,i);
            }
        }
        System.out.println(ans);

    }
}
