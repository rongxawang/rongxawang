package bussiness;

public class Demo3_2 {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, 10, -4, 7, 2, -5};
        System.out.print(findGreatestSumOfSubArray(array));
    }

    public static int findGreatestSumOfSubArray(int[] a) {
        int maxSum = 0;
        int tempSum = 0;

        for (int i = 0; i < a.length; i++) {
            tempSum += a[i];

            if (tempSum > maxSum)
                maxSum = tempSum;
            else if (tempSum < 0)
                tempSum = 0;
        }
        return maxSum;
    }
}
