package com.yin.pattern.observer;

public class Main {

    public static void main(String[] args) {
        //有一个罪犯张三
        Criminal criminal1 = new CriminalA("张三");

        //有个监狱长李四和武警长王五
        PoliceMan armedPolice = new ArmedPolice("王五");
        PoliceMan warden = new Warden("李四");

        //给张三注册监听者
        criminal1.registerObservers(armedPolice);
        criminal1.registerObservers(warden);

        //先走假设张三越狱了，那就要通知李四和王五做出响应动作
        criminal1.notifyAllPoliceMan();


    }
}
