package bussiness;

public class Demo1_2 {
    public static void main(String[] args) {
        String s = "1234sssdmf,,,";
        getNumbers(s);
    }

    public static void getNumbers(String string) {
        int charCount = 0;
        int digitCount = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z' || string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') {
                charCount++;
            } else if (string.charAt(i) >= '0' && string.charAt(i) <= '9') {
                digitCount++;
            }
        }

        System.out.println("字符个数为："+charCount);
        System.out.println("数字个数为："+digitCount);
    }
}
