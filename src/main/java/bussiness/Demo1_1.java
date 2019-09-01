package bussiness;

public class Demo1_1 {
    public static void main(String[] args) {
        int n = 123456789;
        Even(n);
    }

    public static void Even(Integer n) {
        String string = n.toString();
        for (int i = 0; i < string.length(); i += 2) {
            System.out.print(string.charAt(i) + " ");
        }
    }
}
