package cn.itcast.day08.demo06;

public class Demo01Phone {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call();
        phone.send();
        phone.show();
        System.out.println("+==================");

        NewPhoen newPhoen = new NewPhoen();
        newPhoen.call();
        newPhoen.show();
    }
}
