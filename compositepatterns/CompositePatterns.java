package com.sunxiaohang.compositepatterns;

import java.util.Stack;

/**
 * Created by root on 2017/2/27.
 */
public class CompositePatterns {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<String>();
        stack.push("sunxiaohang-index0");
        stack.push("sunxiaohang-index1");
        stack.push("sunxiaohang-index2");
        stack.push("sunxiaohang-index3");
        stack.push("sunxiaohang-index4");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
    }
}
