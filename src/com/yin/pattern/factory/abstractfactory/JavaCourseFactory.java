package com.yin.pattern.factory.abstractfactory;

import com.yin.pattern.factory.simplefactory.ICourse;
import com.yin.pattern.factory.simplefactory.JavaCourse;

public class JavaCourseFactory implements AbstractCourseFactory {
    @Override
    public ICourse createCourse() {
        return new JavaCourse();
    }

    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}
