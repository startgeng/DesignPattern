package com.imooc.openclosedesign;

public class JavaCourse implements ICourse {

    private String name;
    private Integer id;
    private Double price;

    public JavaCourse(String name, Integer id, Double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }
}
