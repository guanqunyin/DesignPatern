package com.yin.pattern.factory.factorymethod;

import com.yin.pattern.factory.simplefactory.ICourse;
import com.yin.pattern.factory.simplefactory.JavaCourse;

public class JavaCourseFactory implements ICourseFactory{
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
