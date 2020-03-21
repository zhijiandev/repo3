package cn.itcast.day08.demo10;

public class Demo02Interface {
    public static void main(String[] args) {
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.methodAbs();

        a.methodDefault();

        System.out.println("================");

        MyInterfaceDefaultB b = new MyInterfaceDefaultB();
        b.methodAbs();

        b.methodDefault();
    }
}
