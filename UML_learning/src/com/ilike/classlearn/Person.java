package com.ilike.classlearn;

import java.util.List;

/**
 * 人
 *
 * @author sangweidong
 * @create 2019-08-15 13:48
 **/
public class Person {

    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private String age;
    /**
     * 性别
     */
    private Integer gender;
    /**
     * 我的宠物猫
     */
    private Cat cat;
    /**
     * 孩子
     */
    private List<Child> childs;
    /**
     * 我的汽车
     */
    private Car car;

    /**
     * 腿
     */
    private List<Leg> legs;

    /**
     * 参观了
     * @param zooEnum
     */
    public void visit(ZooEnum zooEnum){
        System.out.println("周末去动物园参观了"+zooEnum.NAME);
    }
}
