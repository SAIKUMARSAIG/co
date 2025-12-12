import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "aabbbccdeea";
        int cnt = 1;
        int n = s.length();
        char prev = s.charAt(0);
        StringBuilder sb = new StringBuilder();
        for (int i = 1;i<n;i++){
            if (prev == s.charAt(i)){
                cnt++;
            }else{
                if (cnt>1){
                    sb.append('#');
                }else{
                    sb.append(prev);
                }
                cnt  =1;
            }
            prev = s.charAt(i);
        }
        if (s.charAt(n-1)!=s.charAt(n-2)){
            sb.append(s.charAt(n-1));
        }
        System.out.println(sb);

        StringBuilder str = new StringBuilder();
        prev = sb.charAt(0);
        cnt = 1;
        for (int i = 1;i<sb.length();i++){
            if (prev == sb.charAt(i)){
                cnt++;
            }else{
                if (cnt>1){
                    str.append('#');
                }else{
                    str.append(prev);
                }
                cnt  =1;
            }
            prev = sb.charAt(i);
        }
        if (sb.charAt(sb.length()-1)!=sb.charAt(sb.length()-2)){
            str.append(sb.charAt(sb.length()-1));
        }

        System.out.println(str);

    }
}

