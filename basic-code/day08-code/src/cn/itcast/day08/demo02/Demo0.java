package cn.itcast.day08.demo02;

public class Demo0 {

    public static void main(String[] args) {
        int count = 0;

        double min = -10.8;
        double max = 5.9;
        for (double i = Math.ceil(min); i < max; i++) {
            double abs = Math.abs(i);
            if (abs >6 || abs < 2.1){
                count++;
            }
        }


        System.out.println("总共有：" + count);
    }
}
