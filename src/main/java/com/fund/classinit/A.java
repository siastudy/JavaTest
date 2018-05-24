package com.fund.classinit;

class A extends A_Father {
    public static int width = 100;   //静态变量，静态域    field
    public static final int MAX = 100;

    static {
        System.out.println("A的静态代码块");
        width = 300;
    }

    public A() {
        System.out.println("类A的构造函数");
    }
}