package bussiness;

import java.util.Stack;

public class ReverseString_star {
    public static String reverseStr(String string)
    {
        char[] array = string.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(char c:array)
        {
            stack.push(c);
        }

        for(int i= 0 ;i<array.length;i++)
        {
            array[i]=stack.pop();
        }

        return new String(array);
    }

    public static void main(String[] args) {
        System.out.println(ReverseString_star.reverseStr("sdfghj"));
    }
}
