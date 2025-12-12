public class Q20 {
    public static void main(String[] args) {
        String s = "qrty";
        int count = 0;
        int n = s.length();
        for (int i=0;i<n-1;i++){
            int val = Math.abs(s.charAt(i)-s.charAt(i+1));
            count+=val;
        }
        System.out.println(count);
    }
}
