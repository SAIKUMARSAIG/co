class Q31 {

    public static void main(String[] args) {
        String s = "abc";

        int max = 0;
        int curr = 0;
        char expected = 'a';
        char prev = 'a';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == expected) {
                curr++;
                expected++;
            }
            else if (c == 'a') {
                if (prev=='b'){
                    curr++;
                    expected = 'b';
                }else{
                    curr = 1;
                    expected = 'b';
                }
            }
            else {
                // break pattern
                curr = 0;
                expected = 'a';
            }
            prev = c;
            max = Math.max(max, curr);
        }

        System.out.println(max);
    }
}
