package com.imooc.dependceiversion;

public class Test {

    public static void main(String[] args) {
        //v1
//        StudyFeCourse studyFeCourse = new StudyFeCourse();
//        studyFeCourse.studyCourse();
//        StudyJavaCourse studyJavaCourse = new StudyJavaCourse();
//        studyJavaCourse.studyCourse();
        //v2  接口方法的方式注入
//        Kevin kevin = new Kevin();
//        kevin.studyImooc(new StudyFeCourse());
//        kevin.studyImooc(new StudyJavaCourse());
        //v3 构造器注入
//        Kevin kevin = new Kevin(new StudyFeCourse());
//        Kevin kevin2 = new Kevin(new StudyJavaCourse());
//        kevin.studyImooc();
        //v4 setter setter方法注入
        Kevin kevin = new Kevin();
        kevin.setiCourse(new StudyJavaCourse());
        kevin.studyImooc();
    }
}
