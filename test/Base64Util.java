package com.sunxiaohang.test;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;

/**
 * Created by root on 2017/3/3.
 */
public class Base64Util {

    public static String encryptBase64(byte[] data){
        return new BASE64Encoder().encode(data);
    }

    public static String decryptBase64(String data) throws IOException {
        byte[] resultBytes = new BASE64Decoder().decodeBuffer(data);
        return new String(resultBytes);
    }

}
