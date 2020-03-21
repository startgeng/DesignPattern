package com.kevin.lskov;

/**
 * 里斯替换原则 是为了让继承基类的子类更加透明
 */
public class Liskov {

    public static void main(String[] args) {
        //调用  class A class B 引用基类的地方,必须透明使用子类对象
    }
}


class Base{
    //这是一个基类
}

class B extends Base{
    //聚合
    private A a = new A();

    public int func1(int a,int b){
        return a+b;
    }
    public int func2(int a,int b){
        return a-b;
    }

    public int func3(int a,int b){
        return this.a.func1(a,b);
    }
}

class A extends Base{

    public int func1(int a,int b){
        return a+b;
    }
}


