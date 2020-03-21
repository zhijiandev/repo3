package cn.itcast.day08.demo04;

public class Field {

    public static void main(String[] args) {
        Fu fu = new Fu();
        System.out.println(fu.numFu);

        Zi zi = new Zi();
        System.out.println(zi.numFu);
        System.out.println(zi.numZi);

        zi.methodZi();
    }
}
