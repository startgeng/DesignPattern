package com.imooc.openclosedesign;

//单一职责原则  扩展开放接口关闭
//面向接口编程 尽量不修改底层代码  底层代码要是修改会造成不好维护
public interface ICourse {

    String getName();

    Integer getId();

    Double getPrice();
}
