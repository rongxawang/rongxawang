package bussiness;

public class Demo5_1 {
    public static void main(String[] args) {
        int[] array = {1,2,3,6,7};
        System.out.print(getResult(array));
    }

    public static boolean getResult(int[] array) {
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        return evenCount > oddCount;
    }
}
