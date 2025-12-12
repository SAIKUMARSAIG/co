import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s =  "Apple:250:10;Banana:120:15;Orange:300:5";
        String splits[] = s.split(";");
        int count = 0;
        for (String i : splits){
            String arr[] = i.split(":");
            int one = Integer.parseInt(arr[1]);
            int two = Integer.parseInt(arr[2]);
            count = one*two + count;
        }
        System.out.println(count);
    }
}
