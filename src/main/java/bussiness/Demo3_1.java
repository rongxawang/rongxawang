package bussiness;

public class Demo3_1 {
    public static void main(String[] args) {
        String string = "end of file";
        getSimple(string);
    }

    public static void getSimple(String string) {
        String[] strings = string.split(" ");
        for (int i = 0; i < strings.length; i++) {
            System.out.print((char)(strings[i].charAt(0) - 32));
        }
    }
}
