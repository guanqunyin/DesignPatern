package com.yin.pattern.flyweight;

public class TestString {

    public static void main(String[] args) {
        String s = "abc";
        String c = "abc";
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s==c);
        System.out.println(s1==s2);
        System.out.println(s == s1);
        System.out.println(s1.intern() == s);
    }
}
