package com.sunxiaohang.Iteratorpatterns;

import java.util.ArrayList;

/**
 * Created by root on 2017/2/27.
 */
public class Waitress {
    private ArrayList<Iterator> iterators=new ArrayList<Iterator>();

    public Waitress() {
    }
    public void addIterator(Iterator iterator){
        iterators.add(iterator);
    }
    public void printMenu(){
        if(!iterators.isEmpty()){
            for(int i=0,len=iterators.size();i<len;i++){
                while(iterators.get(i).hasNext()){
                    Course c= (Course) iterators.get(i).next();
                    System.out.println("菜名是："+c.getName()+" 描述:"+c.getDesc()+" 是否为素食:"+c.isVegetable()+" 价格："+c.getPrice());
                }
            }
        }else{
            System.out.println("菜单为空，抱歉！");
        }
    }
}















