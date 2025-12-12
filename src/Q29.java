import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "aaabbbcccdddddd";
        int layer=1;
        int i =0;
        int n = s.length();
        int cnt =0;
        while (i+layer<=n){
            String curr = s.substring(i,i+layer);
            boolean isHom = true;
            for (int j=1;j<curr.length();j++){
                if (curr.charAt(j)!=curr.charAt(0)){
                    isHom = false;
                    break;
                }
            }
            if (isHom) cnt++;


            i = i +layer;
            layer++;
        }

        System.out.println(cnt);

    }
}
