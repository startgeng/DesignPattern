package com.imooc.dependceiversion;

public class Kevin {

    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyImooc(){
        iCourse.studyCourse();
    }
}
