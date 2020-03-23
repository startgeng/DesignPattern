package com.imooc.openclosedesign;

public class Test {

    public static void main(String[] args) {
        JavaCourse javaCourse = new JavaDiscountCourse("Java架构之旅",96,100000d);
        System.out.println("id"+":"+javaCourse.getId()+"name"+":"+javaCourse.getName()+"price"+":"+javaCourse.getPrice());
    }
}
