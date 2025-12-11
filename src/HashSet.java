import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet {
    public static void main(String[] args) {
        String s = "SAIKUMAR";
        Set<Character> set1 = new java.util.HashSet<>();
        Set<Character> set2 = new LinkedHashSet<>();
        Set<Character> set3 = new TreeSet<>();
        for (char c : s.toCharArray()){
            set1.add(c);
            set2.add(c);
            set3.add(c);
        }

        System.out.println(set1);
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
    }
}
