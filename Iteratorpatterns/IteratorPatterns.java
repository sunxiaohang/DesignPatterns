package com.sunxiaohang.Iteratorpatterns;

/**
 * Created by root on 2017/2/27.
 */
public class IteratorPatterns {
    public static void main(String[] args) {
        KFC kfc=new KFC();
        McDownload mcDownload=new McDownload();
        Waitress waitress=new Waitress();
        waitress.addIterator(kfc);
        waitress.addIterator(mcDownload);
        waitress.printMenu();
    }
}
