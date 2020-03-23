package com.imooc.openclosedesign;
//折扣价
public class JavaDiscountCourse extends JavaCourse{

    public JavaDiscountCourse(String name, Integer id, Double price) {
        super(name, id, price);
    }

    public Double getOriginprice(){
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice()*0.8;
    }
}
