package com.fund.classinit;

class A_Father extends A_Father_Father {

    public A_Father() {
        System.out.println("A_Father的构造函数");
    }


    static {
        System.out.println("A_Father的静态代码块");
    }
}