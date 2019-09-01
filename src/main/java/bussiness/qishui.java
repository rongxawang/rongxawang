package bussiness;

public class qishui {
    public static void main(String[] args) {
        int n =20;
        System.out.print(getNumber(20));
    }

    public static int getNumber(int n) {
        if (n == 1){
            return 1;
        }else{
            return getNumber(n-1)+2;
        }
    }
}
