package bussiness;

public class jiecheng {
    public static int jiecheng(int number) {
        if (number <= 1)
            return 1;
        else
            return number * jiecheng(number - 1);
    }

    public static void main(String[] args) {
        System.out.println(jiecheng.jiecheng(10));
    }
}
