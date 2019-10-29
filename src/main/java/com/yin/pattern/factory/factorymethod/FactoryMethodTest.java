package com.yin.pattern.factory.factorymethod;

import com.yin.pattern.factory.simplefactory.ICourse;

public class FactoryMethodTest {

    public static void main(String[] args) {
        ICourseFactory iCourseFactory = new JavaCourseFactory();
        ICourse iCourse = iCourseFactory.create();
        iCourse.record();
    }
}
