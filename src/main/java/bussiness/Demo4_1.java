package bussiness;

public class Demo4_1 {
    public static void main(String[] args) {
        long sum = 4;
        long s = 4;

        for (int j = 2; j <= 10; j++) {
            System.out.println(j - 1 + "位数为奇数的个数：" + s);
            if (j <= 2)
                s *= 7;
            else
                s *= 8;
            sum += s;
        }
        System.out.println("一到九位的个数为：" + sum);
    }
}
