package cn.itcast.day05.demo02;

import java.util.ArrayList;

public class Demo03ArrayListMethod {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        boolean success = list.add("柳岩");

        System.out.println("添加的动作是否成功：" + success);

        list.add("高圆圆");

        System.out.println(list);

        String name = list.get(1);
        System.out.println("第二号" + name);

        String whoRemoved = list.remove(1);
        System.out.println("被删除的人是" + whoRemoved);

        System.out.println(list);

        int size = list.size();
        System.out.println("集合长度" + size);
    }
}

