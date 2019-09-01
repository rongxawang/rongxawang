package bussiness;

public class Monkey {
    public static int getTotalPeach(int rest) {
        return (rest + 1) * 2;
    }

    public static void main(String[] args) {
        int rest = 10;
        System.out.print(getTotalPeach(rest));
    }
}
