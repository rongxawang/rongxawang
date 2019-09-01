package bussiness;

public class Pro1 {
    public static void main(String[] args) {
        int n=10;
        System.out.println(fun(n));
    }

    public static int fun(int n)
    {
        if(n==1||n==2)
        {
            return 1;
        }else {
            return fun(n-1)+fun(n-2);
        }
    }
}
