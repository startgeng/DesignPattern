package com.kevin.InterfaceGl;


/**
 * 接口隔离原则
 * 一个类对另一个类的依赖是建立在最小的借口上
 */
public class Segregation {

    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());
    }

    interface Interface1 {
        void operation1();
    }

    interface Interface2 {
        void operation2();

        void operation3();
    }

    interface Interface3 {
        void operation4();

        void operation5();
    }

    static class B implements Interface1, Interface3 {

        @Override
        public void operation1() {
            System.out.println("B 实现类 Operation1");
        }

        @Override
        public void operation4() {
            System.out.println("B 实现类 Operation4");
        }

        @Override
        public void operation5() {
            System.out.println("B 实现类 Operation5");
        }
    }

    static class A {
        public void depend1(Interface1 i){
            i.operation1();
        }

        public void depend2(Interface2 i){
            i.operation2();
        }
        public void depend3(Interface2 i){
            i.operation3();
        }
    }

    static class C{
        public void depend1(Interface1 i){
            i.operation1();
        }
        public void depend2(Interface3 i){
            i.operation4();
        }
        public void depend3(Interface3 i){
            i.operation5();
        }
    }
}
