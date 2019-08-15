package com.ilike.classlearn;



/**
 * 老鹰
 *
 * @author sangweidong
 * @create 2019-08-15 11:51
 **/
public class Eagle extends Animal implements Fly{
    @Override
    public void fly() {
        System.out.println("我是老鹰，我会飞！");
    }

    @Override
    void eat() {
        System.out.println("我是老鹰，我要吃兔子！");
    }

    @Override
    void sleep() {
        System.out.println("我是老鹰，我白天不睡觉捉兔子，晚上再睡！");
    }
}
