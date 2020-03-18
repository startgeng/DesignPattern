package com.kevin.principle;

/**
 * 2020-03-18
 * @Authori kevin
 * 单一职责 描述的是一个类只能负责一件职责 降低带来的风险
 */
public class SingleResponibility {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.run("车");
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("飞机");
    }


}
class Vehicle{

    public void run(String vehicle){
        System.out.println(vehicle + "在公路上运行");
    }
}

class Vehicle2{
    public void run(String vehicle){
        System.out.println(vehicle + "在飞机上运行");
    }
}