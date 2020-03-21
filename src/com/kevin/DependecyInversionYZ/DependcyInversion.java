package com.kevin.DependecyInversionYZ;

/**
 * 依赖倒转原则
 * 将类中的细节依赖于接口编程,体现面向对象编程方法
 */
public class DependcyInversion {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new Wx());
    }
}

interface IReceiver{
    public String getInfo();
}

class Email implements IReceiver {
    @Override
    public String getInfo() {
        return "电子邮件,HelloWorld";
    }
}


class Person{
    public void receive(IReceiver iReceiver){
        System.out.println(iReceiver.getInfo());
    }
}

class Wx implements IReceiver{
    @Override
    public String getInfo() {
        return "Wx 发送消息";
    }
}