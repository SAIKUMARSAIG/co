 class Q17 {
    public static int sumTallBuildings(int N, int[] H, int D) {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            boolean leftOK = (i - D < 0) || (H[i] > H[i - D]);
            boolean rightOK = (i + D >= N) || (H[i] > H[i + D]);
            if (leftOK && rightOK) {
                sum += H[i];
            }
        }
        return sum;
    }
}