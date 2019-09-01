package bussiness;

import java.util.LinkedHashMap;

public class Demo5_2 {
    public static void main(String[] args) {
        String string = "aabcc";
        System.out.print(getChar(string));
    }

    public static int getChar(String string) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (map.containsKey(c)) {
                int time = map.get(c);
                map.put(c, ++time);
            } else {
                map.put(c, 1);
            }
        }

        int pos = -1;
        int size = map.size();
        for (int i = 0; i < size; i++) {
            char c = string.charAt(i);
            if (map.get(c) == 1) {
                return i;
            }
        }
        return pos;
    }
}
