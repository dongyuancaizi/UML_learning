package com.ilike.classlearn;



/**
 * 猫
 *
 * @author sangweidong
 * @create 2019-08-15 11:44
 **/
public class Cat  extends Animal{



    @Override
    void eat() {
        System.out.println("我是猫，我要吃鱼！");
    }

    @Override
    void sleep() {
        System.out.println("我是猫，我白天睡觉，晚上干活！");
    }
}
