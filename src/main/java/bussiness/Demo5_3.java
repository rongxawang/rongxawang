package bussiness;

public class Demo5_3 {

    public static void main(String[] args) {
        String string = "12213";
        getTheMaxSubString(string);
    }

    public static void getTheMaxSubString(String string) {
        if (string.length() == 0 || string == null) {
            return;
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < string.length(); i++) {
            sb.append("#");
            sb.append(string.charAt(i));
        }
        sb.append("#");

        char[] chs = sb.toString().toCharArray();
        int max_len = 0;
        for (int i = 0; i < chs.length; i++) {
            max_len = Math.max(substirng(chs, i), max_len);
        }

        System.out.print(max_len);
    }

    public static int substirng(char[] chs, int i) {
        int len = 0;

        for (int k = 0; k <= i && k < (chs.length - i); k++) {
            if (chs[i - k] == chs[i + k]) {
                len++;
            } else {
                break;
            }
        }
        return len - 1;
    }
}
