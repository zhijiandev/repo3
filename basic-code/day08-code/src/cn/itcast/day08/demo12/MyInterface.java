package cn.itcast.day08.demo12;

public interface MyInterface extends MyInterfaceA, MyInterfaceB{

    public abstract void method();

    @Override
   public  default void methodDefault() {

    }
}
