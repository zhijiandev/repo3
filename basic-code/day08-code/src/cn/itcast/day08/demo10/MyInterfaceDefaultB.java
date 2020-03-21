package cn.itcast.day08.demo10;

public class MyInterfaceDefaultB implements MyInterfaceDefault {
    @Override
    public void methodAbs() {
        System.out.println("是现实抽象方法BBB");
    }

    @Override
    public void methodDefault() {
        System.out.println("实现类B覆盖重写了");
    }
}
