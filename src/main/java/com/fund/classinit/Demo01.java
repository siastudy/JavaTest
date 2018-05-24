package com.fund.classinit;

public class Demo01 {
    static {
        System.out.println("Demo01的静态代码块");
    }


    public static void main(String[] args) throws Exception {
        System.out.println("Demo01的main方法！");

        //主动引用方式1：new
        new A();
        System.out.println("new对象时，类会被初始化。com.fund.classinit.A.width："+A.width);
        //主动引用方式2：调用类的静态成员变量或静态方法
        System.out.println("调用类的静态成员时，类会被初始化。com.fund.classinit.A.width："+A.width);
        //主动引用方式3：Class.forName()映射
        System.out.println("Class.forName()引用时，类会被初始化。:"+Class.forName("com.fund.classinit.A"));

        /* Execution Result:
        ###################################
        Demo01的静态代码块
        Demo01的main方法！
        A_Father_Father的静态代码块
        A_Father的静态代码块
        A的静态代码块
        Constructor of com.fund.classinit.B.A_Father_Father
        A_Father的构造函数
        类A的构造函数
        new对象时，类会被初始化。com.fund.classinit.A.width：300
        调用类的静态成员时，类会被初始化。com.fund.classinit.A.width：300
        Class.forName()引用时，类会被初始化。:class com.fund.classinit.A
        ###################################
        */


//        //被动引用方式1：调用被final的类的常量：
//        System.out.println("-------------------------------------------");
//        System.out.println("调用被final的类的常量，类不会被初始化。com.fund.classinit.A.MAX:" + com.fund.classinit.A.MAX);
//        System.out.println("-------------------------------------------");
//        //被动引用方式2：引用父类的静态变量，不会导致子类初始化。父类以以及祖父类会被初始化。
//        System.out.println("引用父类的静态变量，子类不会被初始化，父类会被初始化。com.fund.classinit.B.width:" + com.fund.classinit.B.width);
//        System.out.println("-------------------------------------------");
//        //被动引用方式3：通过数组定义类的引用：
//        com.fund.classinit.A[] as = new com.fund.classinit.A[10];

        /* Execution Result:
        #######################
        Demo01的静态代码块
        Demo01的main方法！
        -------------------------------------------
        被动引用方式1：调用被final的类的常量。com.fund.classinit.A.MAX:100
        -------------------------------------------
        A_Father_Father的静态代码块
        A_Father的静态代码块
        A的静态代码块
        被动引用方式2：引用父类的静态变量。com.fund.classinit.B.width:300
        -------------------------------------------
        #######################
        */
    }
}