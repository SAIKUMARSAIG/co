public class Q32 {
    public static void main(String[] args) {
        print(41);
    }
    public static void print(int n){
        int res = (int) Math.log10(n)+1;
        if (res==1){
            System.out.println(n);
            return;
        }
        int x = n;
        int sum = 0;
        while (n>0){
            sum = sum+n%10;
            n/=10;
        }
        print(sum);
    }
}
