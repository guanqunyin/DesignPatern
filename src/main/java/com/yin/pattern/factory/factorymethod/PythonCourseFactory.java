package com.yin.pattern.factory.factorymethod;

import com.yin.pattern.factory.simplefactory.ICourse;

public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
