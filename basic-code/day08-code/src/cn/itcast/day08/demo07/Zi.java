package cn.itcast.day08.demo07;

public class Zi extends Fu {

    public Zi() {
        System.out.println("子类构造");
    }

    @Override
    public void eat() {
        System.out.println("吃饭");
    }
}
