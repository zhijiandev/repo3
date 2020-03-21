package cn.itcast.day05.demo02;

import java.util.ArrayList;

public class Demo04ArrayListEach {

    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();

        ArrayList<Integer> listC = new ArrayList<>();
        listC.add(100);
        listC.add(200);
        System.out.println(listC);
        int num = listC.get(1);
        System.out.println(num);
    }
}
