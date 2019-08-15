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
    private Integer age;
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

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public List<Child> getChilds() {
        return childs;
    }

    public void setChilds(List<Child> childs) {
        this.childs = childs;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Leg> getLegs() {
        return legs;
    }

    public void setLegs(List<Leg> legs) {
        this.legs = legs;
    }
}
