package com.sunxiaohang.test;

import java.io.*;
import java.net.Socket;

public class Test {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 2; i++) {
            send();
        }
    }
    public static void send(){
        String sender = "cnsmtp01@163.com";
        String receiver = "1175533526@qq.com";
        String password = "computer";
        // 将用户名和密码进行Base64编码
        String userBase64 = Base64Util.encryptBase64(sender.substring(0,
                sender.indexOf("@")).getBytes());
        String passBase64 = Base64Util.encryptBase64(password.getBytes());
        try {
            Socket socket = new Socket("smtp.163.com", 25);
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    inputStream));
            PrintWriter writter = new PrintWriter(outputStream, true);
            System.out.println(reader.readLine());
            writter.println("HELO jikexueyuan");
            System.out.println(reader.readLine());
            writter.println("AUTH LOGIN");
            System.out.println(reader.readLine());
            writter.println(userBase64);
            System.out.println(reader.readLine());
            writter.println(passBase64);
            System.out.println(reader.readLine());
            writter.println("MAIL FROM:<" + sender + ">");
            System.out.println(reader.readLine());
            writter.println("RCPT TO:<" + receiver + ">");
            System.out.println(reader.readLine());
            writter.println("DATA");
            System.out.println(reader.readLine());
            writter.println("SUBJECT:宛如一个智障");
            writter.println("FROM:" + sender);
            writter.println("TO:" + receiver);
            writter.println("Content-Type: text/plain;charset=\"utf-8\"");
            writter.println();
            writter.println("宛如一个智障");
            writter.println(".");
            writter.println("");
            System.out.println(reader.readLine());
            writter.println("RSET");
            System.out.println(reader.readLine());
            writter.println("QUIT");
            System.out.println(reader.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

