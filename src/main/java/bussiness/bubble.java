package bussiness;

public class bubble {
    public static void main(String[] args) {
        int[] a = {1, 9, 0, 7, 8};
        int size = 5;
        int[] result= bubbleSort(a, size);
        for (int i = 0; i < size; i++) {
            System.out.print(result[i]);
        }
    }

    public static int[] bubbleSort(int[] a, int size) {
        int i, j, t;
        boolean swapped;
        for (i = 1; i < size; ++i) {
            swapped = false;
            for (j = 0; j < size - i; ++j) {
                if (a[j] > a[j + 1]) {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
        return a;
    }
}
