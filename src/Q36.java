import java.util.PriorityQueue;
import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i =0;i<n;i++){
            int num  = sc.nextInt();
            if (pq.size()<k){
                pq.add(num);
            }else if(num > pq.peek()){
                pq.poll();
                pq.add(num);
            }
        }
        System.out.println(pq.peek());

    }
}
