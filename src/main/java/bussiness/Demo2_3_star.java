package bussiness;

public class Demo2_3_star {
    public static void main(String[] args) {
        int[] array = {1, 12, 0, 5, 0, 7, 0, 6, 0};
        getNewArray(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }

    public static void getNewArray(int[] number) {
        int ZeroNum = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] == 0) {
                ZeroNum++;
            } else if (ZeroNum != 0) {
                number[i - ZeroNum] = number[i];
                number[i] = 0;
            }
        }
    }
}
