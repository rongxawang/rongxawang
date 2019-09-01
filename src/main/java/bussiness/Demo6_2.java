package bussiness;

import java.util.Stack;

public class Demo6_2 {
    public static void main(String[] args) {
        String s = "ssadfgg";
        char c = 'k';
        int n = 15;
        toNumer(s, c, n);
    }

    public static void toNumer(String s, char c, int n) {
        Stack<Character> stack = new Stack<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            stack.push(s.charAt(i));
        }

        for (int i = s.length(); i < n; i++) {
            stack.push(c);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(stack.pop());
        }
    }
}
