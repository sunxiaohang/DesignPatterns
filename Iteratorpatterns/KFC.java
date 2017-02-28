package com.sunxiaohang.Iteratorpatterns;

/**
 * Created by root on 2017/2/27.
 */
public class KFC implements Iterator {
    private Course menus[];
    private int index = 0;

    public KFC() {
        Course c1 = new Course("egg", "boil egg", true, 1.5f);
        Course c2 = new Course("hotDog", "toast hotDog", false, 3.0f);
        Course c3 = new Course("rice", "boil rice", true, 1.0f);
        Course c4 = new Course("bread", "toast bread", true, 2.0f);
        menus = new Course[]{c1, c2, c3, c4};
    }

    @Override
    public boolean hasNext() {
        if (index < 4) {
            return true;
        }
        else return false;
    }

    @Override
    public Object next() {
        return menus[index++];
    }
}
