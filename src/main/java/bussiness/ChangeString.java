package bussiness;

public class ChangeString {
    public static String change(String string) {
        char[] cArr = string.toCharArray();
        for (int i = 0; i < cArr.length; i++) {
            if (cArr[i] >= 'A' && cArr[i] <= 'Z') {
                cArr[i] = (char) (cArr[i] + 32);
            } else {
                cArr[i] = (char) (cArr[i] - 32);
            }
        }
        return String.valueOf(cArr);
    }
    public static void main(String[] args) {
        System.out.println(ChangeString.change("aaaadfSSSDAaDF"));
    }
}
