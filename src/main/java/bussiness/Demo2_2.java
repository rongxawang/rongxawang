package bussiness;

public class Demo2_2 {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "badc";
        System.out.println(isDiff(s1, s2));
    }

    public static boolean isDiff(String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i + 1) && s1.charAt(i + 1) == s2.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
