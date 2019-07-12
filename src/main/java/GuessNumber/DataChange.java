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

//    public static String[] getNoSpaceStringA(String str) {
//        if (str == null || str.isEmpty()) {
//            return null;
//        }
//        String[] strings = str.split(" ");
//        return strings;
//    }

//    public static String[] changeStrToStrArray(String str) {
//
//        String[] strings = str.split("");
//        return strings;
//    }

    public static String getNoSpaceString(String str) {
        return str.replace(" ", "");
    }

    public static String getStringwithSpace(String str) {
        return str.replace("", " ").trim();
    }

}
