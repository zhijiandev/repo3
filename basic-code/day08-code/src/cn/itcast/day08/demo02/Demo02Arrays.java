package cn.itcast.day08.demo02;

import java.util.Arrays;

public class Demo02Arrays {

    public static void main(String[] args) {
        String str = "agroiadgoa561ga5ds1g65f";

        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
