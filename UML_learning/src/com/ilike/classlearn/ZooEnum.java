package com.ilike.classlearn;

/**
 * 动物园动物的枚举类
 *
 * @author sangweidong
 * @create 2019-08-15 11:55
 **/
public enum ZooEnum {
    CAT(1, "猫"),
    EAGLE(2, "老鹰");

    public Integer CODE;
    public String NAME;

    ZooEnum(Integer code, String name) {
        this.CODE = code;
        this.NAME = name;
    }

    public static ZooEnum get(Integer code) {
        ZooEnum result = null;
        if (code != null) {
            for (ZooEnum value : ZooEnum.values()) {
                if (code == value.CODE) {
                    result = value;
                    break;
                }
            }
        }
        return result;
    }

    public static boolean contain(Integer code) {
        boolean result = false;
        if (code != null) {
            for (ZooEnum value : ZooEnum.values()) {
                if (code == value.CODE) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

}
