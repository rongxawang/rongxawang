package GuessNumber;

public class DataChange {

    public static boolean containRepeatNum(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        char[] elements = str.toCharArray();
        for (char e : elements) {
            if (str.indexOf(e) != str.lastIndexOf(e)) {
                return true;
            }
        }
        return false;
    }

    public static String[] getStringArray(String str) {
        if (str.isEmpty()) {
            return null;
        }
        return str.split(" ");
    }

    public static String[] changeStrToStrArray(String str) {

        char[] charArray = str.toCharArray();
        String strings = charArray.toString();
        return getStringArray(strings);
    }

    public static String getNoSpaceString(String str) {
        return str.replace(" ", "");
    }

    public static String getStringwithSpace(String str) {
        return str.replace("", " ").trim();
    }

}
