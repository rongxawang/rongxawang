package bussiness;

public class Square {
    public static boolean isSquare(int number)
    {
        int i = 1;
        while (number>0)
        {
           number -=i;
           i+=2;
        }
        return number==0;
    }
}
