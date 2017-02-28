package com.sunxiaohang.Iteratorpatterns;

/**
 * Created by root on 2017/2/27.
 */
public class Course {
    private String name;
    private String desc;
    private boolean vegetable;
    private float price;
    public Course(String name, String desc, boolean vegetable, float price) {
        this.name = name;
        this.desc = desc;
        this.vegetable = vegetable;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public String getDesc() {
        return desc;
    }
    public boolean isVegetable() {
        return vegetable;
    }
    public float getPrice() {
        return price;
    }
}
