package com.ilike.classlearn;

import java.util.List;

/**
 * 汽车
 *
 * @author sangweidong
 * @create 2019-08-15 14:17
 **/
public class Car {
    /**
     * 颜色
     */
    private String color;
    /**
     * 品牌
     */
    private String brand;
    /**
     * 车轮
     */
    private List<Wheel> wheels;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(List<Wheel> wheels) {
        this.wheels = wheels;
    }
}


