package com.sunxiaohang.Iteratorpatterns;

import java.util.*;

/**
 * Created by root on 2017/2/27.
 */
public class McDownload implements Iterator{
    private ArrayList<Course> menus;
    private int index=0;

    public McDownload() {
        Course c1=new Course("Mcegg","McDownload boil egg",true,1.5f);
        Course c2=new Course("MchotDog","McDownload  toast hotDog",false,3.0f);
        Course c3=new Course("Mcrice","McDownload  boil rice",true,1.0f);
        Course c4=new Course("Mcbread","McDownload  toast bread",true,2.0f);
        menus=new ArrayList<>();
        menus.add(c1);menus.add(c2);menus.add(c3);menus.add(c4);
    }

    @Override
    public boolean hasNext() {
        if(index<4)return true;
        else return false;
    }

    @Override
    public Object next() {
        return menus.get(index++);
    }
}
