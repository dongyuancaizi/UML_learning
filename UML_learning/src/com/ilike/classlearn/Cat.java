package com.ilike.classlearn;



/**
 * 猫
 *
 * @author sangweidong
 * @create 2019-08-15 11:44
 **/
public class Cat  extends Animal{
    /**
     * 名字
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;



    @Override
    void eat() {
        System.out.println("我是猫，我要吃鱼！");
    }

    @Override
    void sleep() {
        System.out.println("我是猫，我白天睡觉，晚上干活！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
