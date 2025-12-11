import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<6;i++){
            list.add(sc.nextInt());
        }
        for (int i=6;i<10;i++){
            int val = list.get(i-1)+list.get(i-2);
            list.add(val);
        }
        System.out.println(list);
        System.out.println(list.get(list.size()-1));
    }
}
