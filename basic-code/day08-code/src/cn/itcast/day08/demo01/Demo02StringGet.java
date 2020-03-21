package cn.itcast.day08.demo01;

public class Demo02StringGet {

    public static void main(String[] args) {
        int length = "aghdhaksdhglnaeseg".length();
        System.out.println(length);

        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str3);


        char ch = "Hello".charAt(1);
        System.out.println(ch);

        System.out.println("+==============+");

        String original = "HelloWorldHelloWorld";
        int index = original.indexOf("oo");
        System.out.println(index);
    }
}
