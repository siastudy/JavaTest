package com.fund.classinit;

public class ClassInitDemo2 {

    /**
     * @Title:          main
     * @Description:    类初始化顺序测试
     * @param:          @param args
     * @return:         void
     * @throws
     */
    public static void main(String[] args) {

        new BB();
    }

}

class AA {
    static{
        System.out.println("A的static代码块...");
    }
    public String s1 = prtString("A的成员变量...");
    public static String s2 = prtString("A的static变量...");
    public AA(){
        System.out.println("A的构造函数...");
    }

    public static String prtString(String str) {
        System.out.println(str);
        return null;
    }
}

class BB extends AA{
    public String ss1 = prtString("B的成员变量...");
    public static String ss2 = prtString("B的static变量...");
    public BB(){
        System.out.println("B的构造函数...");
    }
    //private static AA a = new AA();
    static{
        System.out.println("B的static代码块...");
    }
    {
        System.out.println("B的代码块...");
    }
}