package bussiness;

public class IsRunNian {
    public static void main(String[] args) {
        for (int i = 1990; i <= 2010; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0){
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }
}
