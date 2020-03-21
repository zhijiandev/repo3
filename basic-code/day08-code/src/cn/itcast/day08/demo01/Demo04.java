package cn.itcast.day08.demo01;

public class Demo04 {

    public static void main(String[] args) {
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);;
        System.out.println(chars.length);
        System.out.println("+++++++==============");

        byte[] bytes = "bac".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }


        String str1 = "How do you do?";
        String str2 = str1.replace("o", "*");
        System.out.println(str1);  //原字符串无论如何是不会变的
        System.out.println(str2);  //只能变了才能存进去

        String lang1 = "会不会玩，你他妈的";
        String lang2 = lang1.replace("你他妈的","****");
        System.out.println(lang2);
    }
}
