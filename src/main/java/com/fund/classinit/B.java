package com.fund.classinit;

class B extends A {
    static {
        System.out.println("类B的静态代码块");
    }

    public static class A_Father_Father extends Object {

        public A_Father_Father() {
            System.out.println("Constructor of com.fund.classinit.B.A_Father_Father");
        }

        static {
            System.out.println("A_Father_Father的静态代码块");
        }

    }
}