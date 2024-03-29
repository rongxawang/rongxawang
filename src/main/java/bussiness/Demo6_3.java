package bussiness;

public class Demo6_3 {
    public static void main(String[] args) {
        System.out.print(isIP("000.12.132.134"));
    }

    public static boolean isIP(String text) {
        if (text != null && !text.isEmpty()) {
            // 定义正则表达式
            String regex = "^([0-1]\\d{2}|2[0-4]\\d|25[0-5]|\\d{2}|\\d)\\."+
            "([01]?\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."+
            "([01]?\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."+
            "([01]?\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$";
            // 判断ip地址是否与正则表达式匹配
            if (text.matches(regex)) {
                // 返回判断信息
                return true;
            } else {
                // 返回判断信息
                return false;
            }
        }
        return false;
    }
}
