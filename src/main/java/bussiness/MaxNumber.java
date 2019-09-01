package bussiness;

public class MaxNumber {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5};
        System.out.print(getMaxOfNumber(n));
    }

    public static int getMaxOfNumber(int[] n) {
        int res = 0;
        int cur = 0;
        int len = n.length;
        int max = n[0];

        for (int i = 1; i < len; i++) {
            cur = max - n[i];
            if (cur > res) {
                res = cur;
            }

            if (n[i] > max) {
                max = n[i];
            }
        }
        return res;
    }
}
