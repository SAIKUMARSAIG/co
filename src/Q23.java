import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q23 {
    public static void main(String[] args) {
        String s = "B...B...BB...B BBB";
        String []splits = s.split("\\.+");
        System.out.println(Arrays.toString(splits));
        Set<String> set = new HashSet<>();
        for (String i : splits){
            set.add(i);
        }
        System.out.println(set.size());
    }
}
